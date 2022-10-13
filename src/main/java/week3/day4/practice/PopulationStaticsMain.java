package week3.day4.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PopulationStaticsMain {

    public static void main(String[] args) throws IOException {

        String fileName = "from_to.txt";
        List<PopulationMove2> myList = new ArrayList<>();
        Map<String,Integer> myMap = null;
        PopulationStatics populationStatics = new PopulationStatics();
        myList = populationStatics.readLines(fileName);

        myMap = populationStatics.getMoveCntMap(myList);
        System.out.println(myMap);

    }
}

