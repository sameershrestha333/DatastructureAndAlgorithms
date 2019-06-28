package javarevisited.top50;

import java.util.Scanner;

public class FibonacciCalculator {

    public static void main(String[] args) {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number + " numbers : ");
        //printing Fibonacci series upto number
        //fibonnaciIterativeWay(number);
        System.out.println(fibonnaciRecursivelyWay(number));
    }

    private static int fibonnaciRecursivelyWay(int number) {

        if (number == 1|| number ==2)
            return 1;
        return fibonnaciRecursivelyWay(number - 1) + fibonnaciRecursivelyWay(number - 2);
    }

    private static void fibonnaciIterativeWay(int number) {
        int a = 1, b = 1;
        int c = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= number; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }
    }
}
