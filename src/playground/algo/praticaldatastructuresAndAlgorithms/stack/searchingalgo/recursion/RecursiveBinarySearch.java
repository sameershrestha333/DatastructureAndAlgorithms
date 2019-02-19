package playground.algo.praticaldatastructuresAndAlgorithms.stack.searchingalgo.recursion;

public class RecursiveBinarySearch {
    public int search(int data, int left, int right, int[] arrays) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (arrays[mid] == data)
            return mid;
        else if (data >= arrays[mid])
            return search(data, mid + 1, right, arrays);
        else return search(data, left, mid - 1, arrays);
    }
}
