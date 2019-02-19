package playground.algo.praticaldatastructuresAndAlgorithms.stack.searchingalgo.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveSearchTest {

    private RecursiveSearch search;
    private int[] arrays;

    @Before
    public void setUp() throws Exception {
        search = new RecursiveSearch();
        arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Test
    public void searchPositive() {
        assertEquals(3, search.search(4, 0, arrays));
    }

    @Test
    public void searchPositiveI() {
        assertEquals(2, search.search(3, 0, arrays));
    }

    @Test
    public void searchPositiveII() {
        assertEquals(7, search.search(8, 0, arrays));
    }

    @Test
    public void searchNegative() {
        assertEquals(-1, search.search(9, 0, arrays));
    }

    @Test
    public void searchNegativeI() {
        assertEquals(-1, search.search(0, 0, arrays));
    }

}
