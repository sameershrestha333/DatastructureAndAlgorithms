package leetcode.E_231_Power_Of_Two;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        while (n > 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;
        }
        return n == 1;
    }

    public boolean isPowerOfThree(int n) {
        while (n > 1) {
            if (n % 3 != 0)
                return false;
            n /= 3;
        }
        return n == 1;
    }

    public boolean isPowerOfFour(int n) {
        while (n > 1) {
            if (n % 4 != 0)
                return false;
            n /= 4;
        }
        return n == 1;
    }

}
