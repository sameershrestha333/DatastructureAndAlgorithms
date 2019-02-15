package playground.algo.praticaldatastructuresAndAlgorithms.stack;

public class MyStack {

    private int[] arrays;
    private int top;
    private int maxSize;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.arrays = new int[maxSize];
        this.top = -1;
    }


    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int i) {
        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arrays[++top] = i;
    }

    public int pop() {
        return arrays[top--];
    }

    public int peak() {
        return arrays[top];
    }

    public boolean isFull() {
        return getSize() >= maxSize;
    }

    public int getSize() {
        return top + 1;
    }
}
