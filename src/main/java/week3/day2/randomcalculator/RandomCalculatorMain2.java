package week3.day2.randomcalculator;

public class RandomCalculatorMain2{

    public static void main(String[] args) {
        // 부모 = 자식 (다형성 적용)
        NumberGenerator numberGenerator = new RandomNumberGenerator();

        RandomCalculator2 randomCalculator2 = new RandomCalculator2(numberGenerator);
        randomCalculator2.plus(30);
    }
}
