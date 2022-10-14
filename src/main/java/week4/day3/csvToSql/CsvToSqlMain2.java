package week4.day3.csvToSql;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToSqlMain2 {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/ahnjy/Downloads/서울시 병의원 위치 정보.csv";
        List<SeoulHospital2> myList = new ArrayList<>();

        Read2<SeoulHospital2> read2 = new Read2<>(new ParseSeoulHospital2(),true);
        myList = read2.readLines(fileName);

        WriteSeoulHospital2 write = new WriteSeoulHospital2("./src/main/java/week4/day3/csvToSql/seoul_hospital_insert.sql");
        write.writeToFile(myList);
    }
}