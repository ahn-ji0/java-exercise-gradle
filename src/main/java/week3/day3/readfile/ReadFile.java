package week3.day3.readfile;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public char readAChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String read2Chars(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }
    public String readNChars(String filename, int N) throws IOException {
        FileReader fileReader = new FileReader(filename);
        int c = 0;
        String str = "";
        for (int i = 0; i < N; i++) {
            if ((c = fileReader.read()) == -1)
                break;
            str += (char) c;
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        String fileName = "afile.txt";
        char c = readFile.readAChar(fileName);
        String str = readFile.read2Chars(fileName);
        String str2 = readFile.readNChars(fileName, 10);
        System.out.println(c);
        System.out.println(str);
        System.out.println(str2);
    }
}
