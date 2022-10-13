package week4.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read<T> {
    private Parse<T> parse;
    boolean removeColumnName = false;

    public Read(Parse<T> parse){
        this.parse = parse;
    }

    public Read(Parse<T> parse, boolean removeColumnName){
        this.parse = parse;
        this.removeColumnName = removeColumnName;
    }
    public List<T> readLines(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<T> myList = new ArrayList<>();
        String line;

        if(removeColumnName){
            br.readLine();
        }
        while ((line = br.readLine()) != null) {
            T tmp = parse.parsing(line);
            myList.add(tmp);
        }

        return myList;
    }
}
