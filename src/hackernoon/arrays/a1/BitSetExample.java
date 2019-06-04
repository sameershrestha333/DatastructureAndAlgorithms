package hackernoon.arrays.a1;

import java.util.BitSet;

public class BitSetExample {

    public static void main(String[] args) {
        BitSet bitSet = new BitSet(5);

        bitSet.set(0);
        bitSet.set(1);
        bitSet.set(3);
        bitSet.set(4);

        System.out.println("Bitset::" + bitSet);
        int i = bitSet.nextClearBit(0);

        System.out.println("Clear bit next to 0 is " + i);

    }
}
