package week4.day2;

public class ParseSeoulHospital implements Parse<SeoulHospital> {

    public String lookUp(String str){

        String[] lookUpTable = {"피부과", "성형외과", "외과", "내과", "소아과", "가정의학과", "치과"};
        String type = null;
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

        String id = arr[0];
        String address = arr[1];
        String district = address.split("구")[0]+"구";
        String type = arr[3];
        int er = Integer.parseInt(arr[6]);
        String name = arr[10];
        String subdivision = lookUp(name);

        return new SeoulHospital(id,address,district,type,er,name,subdivision);
    }
}
