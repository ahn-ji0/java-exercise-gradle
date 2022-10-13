package week4.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToSqlMain {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/ahnjy/Downloads/서울시 병의원 위치 정보.csv";
        List<SeoulHospital> myList = new ArrayList<>();

        Read<SeoulHospital> read = new Read<>(new ParseSeoulHospital(),true);
        myList = read.readLines(fileName);

        WriteSeoulHospital write = new WriteSeoulHospital("./src/main/java/week4/day2/seoul_hospital_insert.sql");
        write.writeToFile(myList);
    }
}