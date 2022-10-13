package week3.day4.ooppractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Write {
    private File file;

    public Write(String fileName) throws IOException {
        file = new File(fileName);
        file.createNewFile();
    }
    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }
    public void writeToFile(List<PopulationMove> newList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for(PopulationMove inst : newList)
            bw.write(fromToString(inst));
        bw.close();
    }
}


