package algorithm;

import java.util.*;

public class WriteTriangle {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        for(int i=1;i<=4;i++){
            for(int j =0 ;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
