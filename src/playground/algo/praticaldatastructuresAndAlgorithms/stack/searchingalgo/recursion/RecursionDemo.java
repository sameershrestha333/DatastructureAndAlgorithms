package playground.algo.praticaldatastructuresAndAlgorithms.stack.searchingalgo.recursion;

public class RecursionDemo {

    public static void reduceByOne(int n) {
        if (n >= 0) {
            reduceByOne(n - 1);
        }
        System.out.println("Completed call::" + n);
    }

    public static void main(String[] args) {
        reduceByOne(5);
    }

}
