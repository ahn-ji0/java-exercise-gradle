package week3.day4.practice;

import java.io.IOException;
import java.util.List;

public class MakeFromToTxt {

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/ahnjy/Downloads/2021_인구관련연간자료_20220927_66125.csv";
        List<PopulationMove2> myList = null;

        PopulationStatics populationStatics = new PopulationStatics();
        myList = populationStatics.readLines(fileName);
        System.out.println("done");

        WriteTo writeTo2 = new WriteTo("./from_to.txt");
        writeTo2.writeToFile(myList);

    }
}

