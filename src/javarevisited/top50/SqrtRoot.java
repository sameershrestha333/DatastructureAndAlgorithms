package javarevisited.top50;

public class SqrtRoot {

    public static void main(String[] args) {
        System.out.println(getSqrt(2147395600
        ));
    }

    private static int getSqrt(int number) {
        if (number == 0 || number == 1)
            return number;

        int i = 1, result = 1;
        while (result < number) {
            i++;
            result = i * i;
        }
        return i;
    }
}
