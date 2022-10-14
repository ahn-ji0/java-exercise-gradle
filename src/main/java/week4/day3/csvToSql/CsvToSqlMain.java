package week4.day3.csvToSql;

import week4.day3.csvToSql.context.SeoulHospital;
import week4.day3.csvToSql.parser.ParseSeoulHospital;
import week4.day3.csvToSql.readNwrite.Read;
import week4.day3.csvToSql.readNwrite.Write;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvToSqlMain {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/ahnjy/Downloads/서울시 병의원 위치 정보.csv";
        List<SeoulHospital> myList = new ArrayList<>();
        ParseSeoulHospital parseSeoulHospital = new ParseSeoulHospital();
        Read<SeoulHospital> read = new Read<>(parseSeoulHospital,true);
        myList = read.readLines(fileName);

        String writeFileName = "./src/main/java/week4/day3/csvToSql/seoul_hospital_insert.sql";
        Write write = new Write(parseSeoulHospital, writeFileName);
        write.writeToFile(myList);
    }
}