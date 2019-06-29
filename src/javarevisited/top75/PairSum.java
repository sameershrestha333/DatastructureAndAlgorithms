package javarevisited.top75;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

    public static void main(String args[]) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        prettyPrint(numbers, 7);
        System.out.println("Next Input");
        prettyPrint(numbersWithDuplicates, 7);
    }

    private static void prettyPrint(int[] numbers, int num) {
        Set<Integer> set = new HashSet<>(numbers.length);

        for (int n : numbers) {
            int target = num - n;
            if (!set.contains(target)) {
                set.add(n);
            } else {
                System.out.printf("(%d,%d) %n", n, target);
            }

        }


    }
}


