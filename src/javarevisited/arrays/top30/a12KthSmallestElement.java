package javarevisited.arrays.top30;

import java.util.Arrays;

public class a12KthSmallestElement {
    public int getKthSmallestElement(int[] input, int kthElement) {
        Arrays.sort(input);
        return input[kthElement - 1];
    }
}
