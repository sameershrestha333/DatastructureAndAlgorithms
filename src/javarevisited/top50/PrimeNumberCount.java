package javarevisited.top50;

/**
 * 204. Count Primes
 *Count the number of prime numbers less than a non-negative number, n.
 *
 */

public class PrimeNumberCount {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    private static int countPrimes(int n) {

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println("Value" + i);
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
