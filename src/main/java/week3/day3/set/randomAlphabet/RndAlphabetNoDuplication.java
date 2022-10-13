package week3.day3.set.randomAlphabet;

import java.util.HashSet;
import java.util.Set;

public class RndAlphabetNoDuplication {
    public static void main(String[] args) {
        Set<Character> alphabets = new HashSet<>();
        AlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();

        for(int i=0; i<30; i++) {
            char r = randomAlphabetGenerator.generate(65,90);
            alphabets.add(r);
        }

        System.out.println(alphabets);

    }
}
