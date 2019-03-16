package playground.algo.praticaldatastructuresAndAlgorithms.stack.sortingalgo;

public class MergeSort {
    public int[] sort(int[] inputArray, int left, int right) {

        if (right < left) {
            int mid = (left + right) / 2;
            sort(inputArray, left, mid + 1);
            sort(inputArray, mid + 1, right);
            merge(inputArray, left, mid, right);
        }
        return inputArray;
    }

    private void merge(int[] inputArray, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftn1 = new int[n1];
        int[] rightn2 = new int[n2];
        for (int i = 0; i < n1 - 1; i++) {
            leftn1[i] = inputArray[left + 1];
        }

        for (int i = 0; i < n1 - 1; i++) {
            rightn2[i] = inputArray[mid + 1 + i];
        }

    }
}
