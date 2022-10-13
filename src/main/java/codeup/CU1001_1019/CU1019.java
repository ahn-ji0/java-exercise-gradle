package codeup.CU1001_1019;

import java.util.Scanner;

public class CU1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        //그냥 마침표는 임의의 한 문자를 의미한다. 마침표로 구분하고 싶다면 \\. 로
        String[] dateVal = date.split("\\.");

        //%02d 는 두칸을 이용해서 출력하는데, 한자리 수인 경우 앞에 0을 붙여 출력한다.
        System.out.printf("%d.%02d.%02d",Integer.parseInt(dateVal[0]),Integer.parseInt(dateVal[1]),Integer.parseInt(dateVal[2]));
        

    }
}
