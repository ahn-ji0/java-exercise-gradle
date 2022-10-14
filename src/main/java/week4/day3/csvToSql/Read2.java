package week4.day3.csvToSql;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read2<T> {
    private Parse2<T> parse2;
    boolean removeColumnName = false;

    public Read2(Parse2<T> parse2){
        this.parse2 = parse2;
    }

    public Read2(Parse2<T> parse2, boolean removeColumnName){
        this.parse2 = parse2;
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
            T tmp = parse2.parsing(line);
            myList.add(tmp);
        }

        return myList;
    }
}
