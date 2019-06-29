package javarevisited.top50;

import java.util.Scanner;

public class ReverseNumberExample {

    public static void main(String args[]) {
        //input number to reverse
        int number = 1534236469;
        int reverse = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));

    }

    /*
     * reverse a number in Java using iteration
     * @return reverse of number
     */
    public static int reverse(int number) {
        long reverse = 0;
        while (number != 0) {
            int reminder = number % 10;

            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE)
            return 0;
        else
            return (int) reverse;
    }

}

