package playground.algo.praticaldatastructuresAndAlgorithms.stack.searchingalgo.linearsearch;

public class LinearSearch {
    public int search(int data, int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == data)
                return i;
        }

        return -1;
    }
}
