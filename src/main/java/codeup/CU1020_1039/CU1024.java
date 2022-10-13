package codeup.CU1020_1039;

import java.util.Scanner;

public class CU1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        for(int i=0;i<word.length();i++){
            System.out.printf("'%c'\n",word.charAt(i));
        }
        //혹은
//        String[] wordArr = word.split("");
//        for(String str : wordArr){
//            System.out.printf("'%s'\n",str);
//        }

        //혹은
//        char[] chs = word.toCharArray();
//        for(char c : chs){
//            System.out.printf("'%c'\n",c);
//        }

    }
}
