package hackernoon.arrays.a1;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {

    public void printMissingNumber(int[] arrays, int size) {
        System.out.println("Given Arrays :: " + Arrays.toString(arrays));
        BitSet bitSet = new BitSet();
        for (int arrayValue : arrays) {
            bitSet.set(arrayValue);
        }
        int missingElement = size - arrays.length;
        int firstMissingIndex =1;

        for (int i = 0; i <missingElement ; i++) {
            firstMissingIndex = bitSet.nextClearBit(firstMissingIndex);
            System.out.println(firstMissingIndex++);
        }

        int value = bitSet.nextClearBit(1);
        System.out.println("Missing value ::" + value);

    }
}
