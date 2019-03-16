package playground.algo.praticaldatastructuresAndAlgorithms.stack.sortingalgo;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    private MergeSort mergeSort;

    private int left = 0;
    private int right =5;

    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    public void sort() {
        String expected = "3,8,18,19,25,47";
        int[] inputArray = new int[]{8, 18, 47, 25, 3, 19};
        int[] sorted = mergeSort.sort(inputArray,left,right);
        String actual = Arrays.toString(sorted).replaceAll("\\[|\\]|\\s", "");
        assertEquals(expected, actual);
    }

    @Test
    public void sortWith_FirstElementMin() {
        String expected = "3,8,18,19,25,47";
        int[] inputArray = new int[]{3, 18, 47, 25, 8, 19};
        int[] sorted = mergeSort.sort(inputArray,left,right);
        String actual = Arrays.toString(sorted).replaceAll("\\[|\\]|\\s", "");
        assertEquals(expected, actual);
    }

    @Test
    public void sortWith_NegativeNumber() {
        String expected = "-25,-8,3,18,19,47";
        int[] inputArray = new int[]{3, 18, 47, -25, -8, 19};
        int[] sorted = mergeSort.sort(inputArray,left,right);
        String actual = Arrays.toString(sorted).replaceAll("\\[|\\]|\\s", "");
        assertEquals(expected, actual);
    }

}
