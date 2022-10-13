package week3.day3.map;

import java.util.HashMap;

public class AlphabetCnt {
    public static void main(String[] args) {
        //모두 대문자로 변경
        String s1 = "https://github.com/ahn-ji0/java_exercise".toUpperCase();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        //hash map 초기화.
        for(char c = 'A'; c < 'Z'+ 1 ; c++){
            alphabetMap.put(c,0);
        }

        //string 한글자 씩 출력
        for(int idx = 0; idx < s1.length(); idx++) {
            char c = s1.charAt(idx);
            boolean isAlphabet = Alphabet.isAlphabet(c);

            if(isAlphabet){
                alphabetMap.put(c, alphabetMap.get(c)+1);
            }
        }
        System.out.println(alphabetMap);
    }
}
