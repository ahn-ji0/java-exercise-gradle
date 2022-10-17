package algorithm;

import java.util.Scanner;

public class WriteLetter {
    private char letter;

    public WriteLetter(char letter){
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);
        WriteLetter writeLetter = new WriteLetter(letter);
        for(int i=1; i<=4; i++){
            for(int j =0 ;j < i; j++) {
                System.out.print(writeLetter.getLetter());
            }
            System.out.println();
        }
    }
}
