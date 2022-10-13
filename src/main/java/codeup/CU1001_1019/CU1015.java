package codeup.CU1001_1019;

import java.util.Scanner;

public class CU1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        // 소수점 둘째자리 까지 저장(셋째자리에서 반올림하여)
        System.out.printf("%.2f",a);
        sc.close();

    }
}
