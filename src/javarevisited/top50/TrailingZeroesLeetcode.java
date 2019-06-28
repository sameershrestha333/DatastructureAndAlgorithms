package javarevisited.top50;

public class TrailingZeroesLeetcode {

    public int trailingZeroesItrative(int n) {
        int count = 0;
        while (n >= 5) {
            n = n / 5;
            count = count + n;
        }
        return count;
    }


    public int trailingZeroesRecursive(int n) {
        if (n < 5)
            return 0;
        return n / 5 + trailingZeroesRecursive(n / 5);
    }
}
