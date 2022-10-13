package week3.day4.ooppractice.main;

import week3.day4.ooppractice.PopulationMove;
import week3.day4.ooppractice.Read;
import week3.day4.ooppractice.Write;
import week3.day4.ooppractice.parse.ParsePopulationMove;

import java.io.IOException;
import java.util.List;

public class MakeTxtMain {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/ahnjy/Downloads/2021_인구관련연간자료_20220927_66125.csv";
        List<PopulationMove> myList = null;

        Read<PopulationMove> readPopulationMove = new Read<>(new ParsePopulationMove());
        myList = readPopulationMove.readLines(fileName);
        System.out.println("done");

        Write write = new Write("./src/week3/day4/ooppractice/FromTo.txt");
        write.writeToFile(myList);

    }
}
