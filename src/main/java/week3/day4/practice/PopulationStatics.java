package week3.day4.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatics {

//    public PopulationMove parse(String line){
//        String[] arr = line.split(",");
//        return new PopulationMove(Integer.parseInt(arr[6]),Integer.parseInt(arr[0]));
//    }

    public PopulationMove2 parse(String line){
        String[] arr = line.split(",");
        return new PopulationMove2(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
    }

    public List<PopulationMove2> readLines(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<PopulationMove2> myList = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            PopulationMove2 tmp = parse(line);
            myList.add(tmp);
            System.out.printf("전출 : %s, 전입 : %s\n",tmp.getFromSido(),tmp.getToSido());
        }

        return myList;
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove2> myList) {
        Map<String, Integer> myMap = new HashMap<>();
        for(PopulationMove2 pMove : myList){
            String tmp = pMove.getFromSido()+"to"+ pMove.getToSido();
            if(!myMap.containsKey(tmp))
                myMap.put(tmp,1);
            else
                myMap.put(pMove.getFromSido()+"to"+ pMove.getToSido(),myMap.get(tmp)+1);
        }
        return myMap;
    }
}


