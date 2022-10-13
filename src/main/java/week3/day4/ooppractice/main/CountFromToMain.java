package week3.day4.ooppractice.main;

import week3.day4.ooppractice.PopulationMove;
import week3.day4.ooppractice.Read;
import week3.day4.ooppractice.parse.ParseFromTo;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFromToMain {
    public static Map<String,Integer> listToMap(List<PopulationMove> myList){
        Map<String,Integer> map = new HashMap<>();
        for(PopulationMove tmp : myList) {
            String str = tmp.getFromSido() + "," + tmp.getToSido();
            if (!map.containsKey(str))
                map.put(str, 1);
            else
                map.put(str, map.get(str) + 1);
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        String fileName = "./src/week3/day4/ooppractice/FromTo.txt";
        List<PopulationMove> myList = null;

        Read<PopulationMove> readPopulationMove = new Read<>(new ParseFromTo());
        myList = readPopulationMove.readLines(fileName);
        System.out.println("done");

        Map<String,Integer> fromToMap = CountFromToMain.listToMap(myList);
        System.out.println(fromToMap);
    }
}
