package hackernoon.arrays.a9ReverseString;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String input1 = "abc";
        String input2 = "abcd";
        String input3 = "abcdefghijklmnopqrstuvwxyz";
        reverse(input1);
        reverse(input2);
        reverse(input3);

    }

    private static void reverse(String inputstr) {
        System.out.println(inputstr);
        char[] charArray = inputstr.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char tempChar = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tempChar;
        }
        System.out.println(Arrays.toString(charArray));


    }

}
