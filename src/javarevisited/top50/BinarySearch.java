package javarevisited.top50;

/**
 * t's much faster than the linear search which scans each and every element and
 * improves performance from O(n) to O(logN) for searching an element in the array
 *
 * In order to perform the binary search, you need a sorted array
 *
 *Since Binary Search can be easily implemented using Recursion
 *
 * binary search works on the principle of divide and conquer.
 *
 */



public class BinarySearch {

    public static int performBinarySearch(int[] input, int number) {
        int low = 0;
        int high = input.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (input[middle] == number) {
                return middle;
            } else if (input[middle] < number) {
                low = middle + 1;
            } else if (input[middle] > number) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
