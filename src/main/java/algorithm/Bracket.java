package algorithm;

public class Bracket {
    public boolean solution(String s){
        while(s.indexOf("()") >=0){
            s = s.replace("()","");
        }
        return s.length() == 0;
    }
}
