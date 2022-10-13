package week3.day3.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadFile {

    //지정한 파일의 1 byte 읽어오는 메소드를 만들어 보세요
    public static char readOneLetter(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        char c = (char) br.read();
        return c;
    }

    public static String readTwoLetters(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        char c = 0;
        String str = "";
        for (int i = 0; i < 2; i++) {
            c = (char) br.read();
            if (c == -1)
                break;
            str += c;
        }
        return str;
    }

    public static String readNLetters(String fileName, int N) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        char c = 0;
        String str = "";
        for (int i = 0; i < N; i++) {
            c = (char) br.read();
            if (c == -1)
                break;
            str += c;
        }
        return str;
    }

    public static String readALine(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        return line;
    }

    public static String readNLines(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        return line;
    }
}
