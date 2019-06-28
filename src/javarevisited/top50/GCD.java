package javarevisited.top50;

/**
 * https://www.java67.com/2012/08/java-program-to-find-gcd-of-two-numbers.html
 */


public class GCD {
    public static void main(String[] args) {
        System.out.println(getGCD(54, 24));
    }

    private static int getGCD(int x, int y) {
        if (y == 0)
            return x;

        return getGCD(y, x % y);


    }
}
