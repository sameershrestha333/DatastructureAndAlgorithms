package playground.algo.praticaldatastructuresAndAlgorithms.stack.searchingalgo.linearsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {
    private LinearSearch search;
    private int[] arrays;

    @Before
    public void setUp() throws Exception {
        search = new LinearSearch();
        arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Test
    public void searchPositive() {
        assertEquals(3, search.search(4, arrays));
    }

    @Test
    public void searchNegative() {
        assertEquals(-1, search.search(9, arrays));
    }
}
