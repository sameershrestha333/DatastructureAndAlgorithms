package leetcode.E_232_Implement_Queue_using_Stacks;

import java.util.Iterator;
import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack.add(x);

    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!empty()) {
            Iterator<Integer> it = stack.iterator();
            while (it.hasNext()) {
                Integer value = it.next();
                if (!it.hasNext()) ;
                it.remove();
                return value;
            }
        }

        return Integer.parseInt(null);
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!empty()) {
            Iterator<Integer> it = stack.iterator();
            while (it.hasNext()) {
                Integer value = it.next();
                if (!it.hasNext()) ;
                return value;
            }
        }

        return Integer.parseInt(null);
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.empty();
    }
}
