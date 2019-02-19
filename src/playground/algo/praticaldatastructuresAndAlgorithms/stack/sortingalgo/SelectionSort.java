package playground.algo.praticaldatastructuresAndAlgorithms.stack.sortingalgo;

public class SelectionSort {
    public int [] sort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int min = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[min]) {
                    min = j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[min];
            inputArray[min] = temp;
        }
        return inputArray;
    }
}
