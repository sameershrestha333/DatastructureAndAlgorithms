package javarevisited.top50;

import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String args[]) {

        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }

    private static boolean isPalindrome(int number) {

        int givenInput = number;// copied number to variable
        int reverse = 0;

        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }

        if (givenInput == reverse)
            return true;

        return false;
    }
}
