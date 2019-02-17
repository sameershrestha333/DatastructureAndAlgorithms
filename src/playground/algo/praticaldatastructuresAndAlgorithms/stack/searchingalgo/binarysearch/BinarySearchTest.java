package playground.algo.praticaldatastructuresAndAlgorithms.stack.searchingalgo.binarysearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    private BinarySearch search;
    private int[] arrays;

    @Before
    public void setUp() throws Exception {
        search = new BinarySearch();
        arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Test
    public void searchPositive() {
        assertEquals(3, search.search(4, arrays));
    }

    @Test
    public void searchPositiveI() {
        assertEquals(2, search.search(3, arrays));
    }

    @Test
    public void searchPositiveII() {
        assertEquals(7, search.search(8, arrays));
    }

    @Test
    public void searchNegative() {
        assertEquals(-1, search.search(9, arrays));
    }

    @Test
    public void searchNegativeI() {
        assertEquals(-1, search.search(0, arrays));
    }

}
