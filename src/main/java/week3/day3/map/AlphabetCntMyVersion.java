package week3.day3.map;

import java.util.HashMap;

public class AlphabetCntMyVersion {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/ahn-ji0/java_exercise".toLowerCase();
        HashMap<String,Integer> alphabetCount = new HashMap<>();

        for(int idx = 0; idx < repoAddr.length(); idx++) {
            char c = repoAddr.charAt(idx);
            if(Alphabet.isAlphabet(c)){
                String tmp = Character.toString(c);
                if(!alphabetCount.containsKey(tmp))
                    alphabetCount.put(tmp,0);
                alphabetCount.put(tmp, alphabetCount.get(tmp)+1);
            }
        }
        System.out.println(alphabetCount);
    }
}
