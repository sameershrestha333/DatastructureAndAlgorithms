package playground.algo.praticaldatastructuresAndAlgorithms.stack.bst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BSTTest {
    private BST bst;

    @Before
    public void setUp() throws Exception {
        bst = new BST();
    }

    @Test
    public void isEmpty() {
        assertTrue(bst.isEmpty());
    }

    @Test
    public void insert() {
        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(20);
        assertEquals(5, bst.findSmallest());
        assertEquals(20, bst.findLargest());
    }

    @Test
    public void insertII() {
        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(2);
        bst.insert(20);
        bst.insert(25);
        assertEquals(2, bst.findSmallest());
        assertEquals(25, bst.findLargest());
    }

    @Test
    public void deleteRightLeaf() {
        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(2);
        bst.insert(20);
        bst.insert(25);
        bst.delete(25);
        assertEquals(20, bst.findLargest());
    }

    @Test
    public void deleteLeftLeaf() {
        bst.insert(10);
        bst.insert(15);
        bst.insert(5);
        bst.insert(2);
        bst.insert(20);
        bst.insert(25);
        bst.delete(2);
        assertEquals(5, bst.findSmallest());
    }


}