package codeup.CU1020_1039;

import java.util.Scanner;

public class CU1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] num = sc.next().split("");
        int numLength = num.length;
        int tmp;
        for(int idx = 0; idx < num.length; idx++){
            tmp = (int) (Integer.parseInt(num[idx]) * Math.pow(10, numLength - idx - 1));
            System.out.printf("[%d]\n",tmp);
        }

    }
}
