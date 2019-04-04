package playground.algo.praticaldatastructuresAndAlgorithms.dynamic_programming.fibonacii;

import java.util.HashMap;
import java.util.Map;

public class Fibonacii {

    private Map<Integer, Integer> mapTable;

    public Fibonacii() {
        this.mapTable = new HashMap<>();
        this.mapTable.put(0, 0);
        this.mapTable.put(1, 1);
    }

    public static void main(String[] args) {
        System.out.println("DP "+new Fibonacii().fibonacciDP(100));
        System.out.println("Without DP " + new Fibonacii().nativeFibonacci(100));
    }

    // It has exponential running time
    public int nativeFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return nativeFibonacci(n - 1) + nativeFibonacci(n - 2);
    }

    public int fibonacciDP(int n) {

        if (mapTable.containsKey(n)) return mapTable.get(n);

        mapTable.put(n - 1, fibonacciDP(n - 1));
        mapTable.put(n - 2, fibonacciDP(n - 2));

        int calculateNumber = mapTable.get(n - 1) + mapTable.get(n - 2);

        mapTable.put(n, calculateNumber);
        return calculateNumber;

    }
}
