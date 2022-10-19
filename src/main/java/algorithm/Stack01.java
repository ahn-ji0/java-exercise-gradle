package algorithm;

public class Stack01 {
    private int[] arr = new int[10000];
    private static int pointer = 0;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value){
        arr[this.pointer] = value;
        this.pointer++;
    }

    public int pop(){
        this.pointer--;
        return arr[this.pointer];
    }

    public int[] getArr(){
        return arr;
    }
}
