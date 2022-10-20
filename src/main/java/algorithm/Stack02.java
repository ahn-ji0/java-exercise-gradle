package algorithm;

public class Stack02 {
    private Integer[] arr;
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        this.arr[top++] = value;
    }

    public Integer[] getArr(){
        return this.arr;
    }

    public int pop() {
        return this.arr[--top];
    }

    public int peek(){
        return this.arr[top-1];
    }

    public boolean isEmpty(){
        return top == 0;
    }
}
