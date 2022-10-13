package week3.day3.readfile;

import java.io.File;
import java.io.FileNotFoundException;

public class CurrentDirectoryFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files)
            System.out.println(file);
    }

    /*
    ./java_exercise.iml
    ./out
    ./.gitignore
    ./.git
    ./.idea
    ./src
    */
}
