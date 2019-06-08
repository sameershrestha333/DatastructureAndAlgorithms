package hackernoon.arrays.a2removeDuplicates;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 1, 2, 2, 3, 4, 5, 5};

        removeDup(inputArray);
    }

    private static void removeDup(int[] inputArray) {
        System.out.println("Arrays with duplicates: " + Arrays.toString(inputArray));
        int j = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] != inputArray[i + 1])
                inputArray[j++] = inputArray[i];
        }
        inputArray[j++] = inputArray[inputArray.length - 1];
        int[] returnedArrays = Arrays.copyOf(inputArray, j);
        System.out.println("Arrays without duplicates: " + Arrays.toString(returnedArrays));

    }
}
