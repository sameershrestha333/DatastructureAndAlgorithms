package javarevisited.arrays.top30;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonRepeatedNumberTest {

    private NonRepeatedNumber nonRepeatedNumber;

    @Before
    public void setUp() {
        nonRepeatedNumber = new NonRepeatedNumber();
    }

    @Test
    public void getNonRepeatedNumber() {
        int[] inputArray = new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5};
        int expectedOutput = nonRepeatedNumber.getNonRepeatedNumber(inputArray);
        assertEquals(3, expectedOutput);

    }

    @Test
    public void getNonRepeatedNumberUnsorted() {
        int[] inputArray = new int[]{3, 4, 5, 3, 4};
        int expectedOutput = nonRepeatedNumber.getNonRepeatedNumberUnSortedArray(inputArray);
        assertEquals(5, expectedOutput);

    }

}