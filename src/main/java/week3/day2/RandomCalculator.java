package week3.day2;

public class RandomCalculator{
    private int a;
    private int randNum;

    public RandomCalculator(int a) {
        this.a = a;
        this.randNum = (int) (Math.random() * 10);
        System.out.println("random number : "+ randNum);
    }

    public int Plus(){return a+randNum;}
    public int Minus(){return a-randNum;}
    public int Multiply(){return a*randNum;}
    public double Divide(){
        double result = 0;
        try {
            result = (double) a / randNum;
        }catch (Exception e){
            System.out.println("Error");
        }
        return result;
    }


}
