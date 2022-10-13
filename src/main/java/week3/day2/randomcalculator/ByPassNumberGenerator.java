package week3.day2.randomcalculator;

public class ByPassNumberGenerator implements NumberGenerator{
    // 숫자 전달해주는 역할.
    @Override
    public int generate(int num) {
        return num;
    }
}
