package codeup.CU1001_1019;

import java.util.Scanner;

public class CU1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dateTime = sc.next();

        //첫번째 방법
        System.out.println(dateTime);

        // 두번째 방법
        //str.split()의 return형은 String[]
        String[] dT = dateTime.split(":");
        System.out.println(dT[0]+":"+dT[1]);
        sc.close();
    }
}
