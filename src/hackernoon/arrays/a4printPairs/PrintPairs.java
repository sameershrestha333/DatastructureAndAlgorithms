package hackernoon.arrays.a4printPairs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintPairs {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int[] ints = prettyPrint(numbers, 7);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] prettyPrint(int[] numbers, int givenNumber) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 1;
        int[] outPutArray = new int[numbers.length];
        for (int value : numbers) {
            int target = givenNumber - value;

            if (set.contains(target)) {
                outPutArray[i] = value;
                outPutArray[j] = target;
                i = i + 2;
                j = i + 1;
            } else {
                set.add(value);
            }

        }

        return outPutArray;
    }


}
