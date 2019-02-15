package playground.algo.praticaldatastructuresAndAlgorithms.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    private MyStack stack;

    @Before
    public void setUp() throws Exception {
        stack = new MyStack(3);
    }

    @Test
    public void isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void push() {
        stack.push(5);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pop() {
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.pop());
        assertEquals(6, stack.pop());
    }

    @Test
    public void peak() {
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertEquals(7, stack.peak());
        assertEquals(7, stack.peak());
    }

    @Test
    public void isFull() {
        stack.push(5);
        stack.push(6);
        stack.push(7);
        assertTrue(stack.isFull());
    }


    @Test
    public void isFullII() {
        stack.push(5);
        stack.push(6);
        assertFalse(stack.isFull());
    }

    @Test
    public void stackOverflow() {
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(7);
        stack.push(7);
    }

}
