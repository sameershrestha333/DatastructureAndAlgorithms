package playground.algo.praticaldatastructuresAndAlgorithms.stack;

import java.util.Arrays;

public class MyQueue {
    private int maxSize;
    private int[] arrays;
    private int front;
    private int rear;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arrays = new int[maxSize];
        front = -1;
        rear = 0;
    }


    public boolean isEmpty() {
        return front < 0;
    }

    public void enqueue(int data) {
        if (isEmpty()) {
            arrays[++front] = data;
        } else {
            if (isFull()) {
                increaseArray();
            }
            arrays[++rear] = data;
        }
    }

    private void increaseArray() {
        int newSize = maxSize * 2;
        arrays = Arrays.copyOf(arrays, newSize);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        int dequeueValue = arrays[front];
        front++;
        return dequeueValue;
    }

    public int getSize() {
        return rear + 1;
    }

    public boolean isFull() {
        return getSize() == arrays.length;
    }
}
