package leetcode.E_225_Implement_Stack_using_Queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public static void main(String[] args) {

        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (!empty()) {
            Iterator<Integer> iterator = queue.iterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (!iterator.hasNext()) {
                    iterator.remove();
                    return next;
                }
            }
        }
        return Integer.parseInt(null);
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (!empty()) {
            Iterator<Integer> iterator = queue.iterator();
            while (iterator.hasNext()) {
                final Integer next = iterator.next();
                if (!iterator.hasNext()) {
                    return next;
                }
            }
        }
        return Integer.parseInt(null);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }

}
