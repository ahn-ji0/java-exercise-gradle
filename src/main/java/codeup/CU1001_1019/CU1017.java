package codeup.CU1001_1019;

import java.util.Scanner;

public class CU1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        // 소수점 둘째자리 까지 저장(셋째자리에서 반올림하여)
        System.out.printf("%d %d %d\n",num, num, num);
        sc.close();

    }
}
