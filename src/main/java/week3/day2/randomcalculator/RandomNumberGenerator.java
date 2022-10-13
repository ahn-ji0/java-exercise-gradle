package week3.day2.randomcalculator;

public class RandomNumberGenerator implements NumberGenerator{
    //random 숫자 생성.
    @Override
    public int generate(int num) {
        return (int) (Math.random() * num);
    }
}
