package week3.day2;

import java.util.Scanner;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        RandomCalculator randomCalculator = new RandomCalculator(a);

        System.out.println("Plus : "+randomCalculator.Plus());
        System.out.println("Minus : "+randomCalculator.Minus());
        System.out.println("Multiply : "+randomCalculator.Multiply());
        System.out.println("Divide : "+randomCalculator.Divide());
    }
}
