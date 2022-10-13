package week4.day2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteSeoulHospital {
    private File file;

    public WriteSeoulHospital(String fileName) throws IOException {
        file = new File(fileName);
        file.createNewFile();
    }
    public String sqlForm(SeoulHospital inst){
        return String.format("('%s','%s','%s','%s',%d,'%s','%s')",inst.getId(),inst.getAddress(),
                inst.getDistrict(),inst.getType(),inst.getEr(),inst.getName(),inst.getSubdivision());
    }

    public void writeToFile(List<SeoulHospital> newList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        int idx = 0;
        bw.write("INSERT INTO `hospital`.`seoul_hospital`(`id`,`address`,`district`,`type`,`er`,`name`,`subdivision`)\n");
        bw.write("VALUES\n");
        for(idx = 0; idx < newList.size() - 1; idx++) {
            bw.write(sqlForm(newList.get(idx)));
            bw.write(",");
        }
        bw.write(sqlForm(newList.get(idx)));
        bw.write(";");
        bw.close();
    }
}


