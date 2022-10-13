package week3.day2;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        Calculator calculator = new Calculator(a,b);
        System.out.println(calculator.plus());
        System.out.println(calculator.minus());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());


    }
}
