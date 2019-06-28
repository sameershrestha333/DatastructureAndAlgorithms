package javarevisited.top50;

public class Factorial {

    public static void main(String[] args) {
        int input1 = 5;
        int input2 = 6;
        int input3 = 1808548329;

        System.out.println(findFactorial(input1));
        System.out.println(findFactorial(input2));
        System.out.println(findFactorial(input3));
    }

    private static int findFactorial(int inputNumber) {
        if (inputNumber == 1)
            return 1;
        return inputNumber * findFactorial(inputNumber - 1);
    }


}
