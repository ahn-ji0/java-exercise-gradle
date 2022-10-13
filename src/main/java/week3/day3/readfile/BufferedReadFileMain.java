package week3.day3.readfile;

import java.io.IOException;

public class BufferedReadFileMain {

    public static void main(String[] args) throws IOException {
        String fileName = "afile.txt";
        char c;
        String str1, str2, str3;

        System.out.print("read one letter : ");
        c = BufferedReadFile.readOneLetter(fileName);
        System.out.println(c);

        System.out.print("read two letters : ");
        str1 = BufferedReadFile.readTwoLetters(fileName);
        System.out.println(str1);

        int N = 6;
        System.out.printf("read %d letters : ",N);
        str2 = BufferedReadFile.readNLetters(fileName,N);
        System.out.println(str2);

        System.out.print("read a line : ");
        str3 = BufferedReadFile.readALine(fileName);
        System.out.println(str3);
    }
}
