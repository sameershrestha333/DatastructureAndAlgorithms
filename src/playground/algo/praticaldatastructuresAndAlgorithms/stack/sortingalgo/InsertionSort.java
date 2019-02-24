package playground.algo.praticaldatastructuresAndAlgorithms.stack.sortingalgo;

public class InsertionSort {
    public int[] sort(int[] Arr) {
        for (int i = 1; i < Arr.length; i++) {
            int element = Arr[i];
            int j = i - 1;

            while (j >= 0 && element < Arr[j]) {
                Arr[j + 1] = Arr[j];
                j--;
            }
            Arr[j + 1] = element;
        }
        return Arr;
    }
}
