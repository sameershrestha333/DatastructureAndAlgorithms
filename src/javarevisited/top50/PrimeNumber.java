package javarevisited.top50;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Enter number to check if prime or not ");
        while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("Does %d is prime? %s ", number, isPrime(number));
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;

    }
}
