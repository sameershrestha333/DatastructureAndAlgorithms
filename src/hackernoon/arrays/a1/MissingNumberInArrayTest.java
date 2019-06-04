package hackernoon.arrays.a1;

import org.junit.Before;
import org.junit.Test;

public class MissingNumberInArrayTest {

    private MissingNumberInArray missingNumberInArray;

    @Before
    public void setUp() {
        missingNumberInArray = new MissingNumberInArray();
    }

    @Test
    public void test1(){
        missingNumberInArray.printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
    }

    @Test
    public void test2(){
        missingNumberInArray.printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
    }

}