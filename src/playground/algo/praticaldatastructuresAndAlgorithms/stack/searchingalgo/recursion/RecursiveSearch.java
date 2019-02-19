package playground.algo.praticaldatastructuresAndAlgorithms.stack.searchingalgo.recursion;

public class RecursiveSearch {
    public int search(int data, int index, int[] arrays) {
        if (arrays[index] == data)
            return index;
        else if (index >= arrays.length - 1)
            return -1;
        else {
            System.out.println("Index ::" + index);
            return search(data, index + 1, arrays);
        }
    }
}
