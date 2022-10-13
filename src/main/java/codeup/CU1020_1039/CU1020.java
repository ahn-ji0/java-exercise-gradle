package codeup.CU1020_1039;

import java.util.Scanner;

public class CU1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String idInput = sc.nextLine();
        String[] id = idInput.split("-");
        System.out.printf("%s%s",id[0],id[1]);

    }
}
