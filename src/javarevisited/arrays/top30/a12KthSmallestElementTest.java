package javarevisited.arrays.top30;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class a12KthSmallestElementTest {

    private a12KthSmallestElement a12KthSmallestElement;

    @Before
    public void setUp() {
        a12KthSmallestElement = new a12KthSmallestElement();
    }

    @Test
    public void getKthSmallestElement() {
        int[] input = new int[]{1, 2, 3, 9, 4};
        int value = a12KthSmallestElement.getKthSmallestElement(input, 2);
        assertEquals(2, value);
    }
}