package playground.algo.praticaldatastructuresAndAlgorithms.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyQueueTest {
    private MyQueue queue;

    @Before
    public void setUp() throws Exception {
        queue = new MyQueue(5);
    }

    @Test
    public void isEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void enqueue() {
        queue.enqueue(5);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void dequeue() {
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        assertEquals(5, queue.dequeue());
        assertEquals(7, queue.dequeue());
    }

    @Test
    public void getSize() {
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        assertEquals(4, queue.getSize());
    }

    @Test
    public void increaseArray() {
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        assertEquals(6, queue.getSize());
    }


}
