package playground.algo.praticaldatastructuresAndAlgorithms.stack.searchingalgo.binarysearch;

public class BinarySearch {
    public int search(int data, int[] arrays) {
        int left = 0;
        int right = arrays.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (arrays[mid] == data) {
                return mid;
            } else if (arrays[mid] < data) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return -1;
    }
}
