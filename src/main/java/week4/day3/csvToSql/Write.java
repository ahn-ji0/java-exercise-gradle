package week4.day3.csvToSql;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Write<T> {
    private Parse<T> parse;
    private File file;

    public Write(Parse<T> parse, String fileName) throws IOException {
        this.parse = parse;
        file = new File(fileName);
        file.createNewFile();
    }


    public void writeToFile(List<T> newList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        int idx = 0;
        bw.write(parse.intro());
        for(int i=0;i< newList.size();i++) {
            bw.write(parse.revparse(newList.get(i),(i == newList.size()-1 ? true : false)));
        }
        bw.close();
    }
}

