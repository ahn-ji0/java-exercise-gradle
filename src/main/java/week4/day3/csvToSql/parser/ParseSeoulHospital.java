package week4.day3.csvToSql.parser;

import week4.day3.csvToSql.context.SeoulHospital;

public class ParseSeoulHospital implements Parse<SeoulHospital> {

    public String lookUp(String str){

        String[] lookUpTable = {"내과", "외과", "소아", "피부", "성형", "정형외과", "척추", "교정", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과"};
        String type = "";
        for(String subdiv : lookUpTable){
            if(str.contains(subdiv)){
                type = subdiv;
                break;
            }
        }
        return type;
    }

    @Override
    public SeoulHospital parsing(String str) {

        String[] arr = str.split(",");
        //이때 arr[0] = ""A1120837""로 저장됨.
        String id = arr[0];
        String address = arr[1];
        String district = address.split("구")[0]+"구";
        String type = arr[3];
        int er = Integer.parseInt(arr[6]);
        String name = arr[10];
        String subdivision = lookUp(name);

        return new SeoulHospital(id,address,district,type,er,name,subdivision);
    }

    @Override
    public String revparse(SeoulHospital object, boolean last) {
        if(!last) {
            return object.getSqlQuery() + ",\n";
        }

        return object.getSqlQuery() + ";";
    }

    @Override
    public String intro() {
        String intro = "INSERT INTO `hospital`.`seoul_hospital`(`id`,`address`,`district`,`type`,`er`,`name`,`subdivision`)\n"+
                "VALUES\n";
        return intro;
    }
}
