package week3.day2;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int plus(){return a+b;}
    public int minus(){return a-b;}
    public int multiply(){return a*b;}
    public double divide(){return (double)a/b;}

}
