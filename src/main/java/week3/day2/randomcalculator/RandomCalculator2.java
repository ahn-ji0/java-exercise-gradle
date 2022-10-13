package week3.day2.randomcalculator;

public class RandomCalculator2 {
        //NumberGenerator에서 만들어준 숫자를 가지고 사칙 연산한 결과를 출력한다.

       private NumberGenerator numberGenerator;
       private int baseNum = 0;
       /* 생성자. 인자로 NumberGenerator를 설정하였다.
       해당 interface를 implement하는 하위 클래스들이 들어올 수 있음. */
       public RandomCalculator2(NumberGenerator numberGenerator){
           this.numberGenerator = numberGenerator;
           this.baseNum = 10;
       }

        public RandomCalculator2(NumberGenerator numberGenerator, int baseNum){
            this.numberGenerator = numberGenerator;
            this.baseNum = baseNum;
        }

       //randomCalculator2.plus 인자로 넘어온 것과 random number 를 더한 것을 출력
       public void plus(int num) {
           //this.numberGenerator.generate(10)은 인자로
           int result = num + this.numberGenerator.generate(baseNum);
           System.out.println(result);
       }
}
