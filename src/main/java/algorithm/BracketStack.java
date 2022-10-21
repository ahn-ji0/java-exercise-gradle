package algorithm;

class Stack{
    private char[] arr = new char[100000];
    int pointer = 0;

    public void push(char str){
        arr[pointer++] = str;
    }
    public char pop(){
        return arr[pointer--];
    }
    public boolean isEmpty(){
        return pointer == 0;
    }
    public char peek(){
        return arr[pointer-1];
    }
}

public class BracketStack {
    boolean solution(String s) {
        boolean answer = true;
        Stack stack = new Stack();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty())
            return false;

        return true;
    }
}
