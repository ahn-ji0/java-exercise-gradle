package codeup.CU1020_1039;

import java.util.Scanner;

public class CU1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String f = sc.next();
        String[] arr = f.split("\\.");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
