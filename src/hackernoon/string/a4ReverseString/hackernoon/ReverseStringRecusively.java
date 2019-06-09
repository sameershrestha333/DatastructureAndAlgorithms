package hackernoon.string.a4ReverseString.hackernoon;

public class ReverseStringRecusively {

    public static void main(String[] args) {
        System.out.println(reverseRecursively("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(reverseRecursively("zyxwvutsrqponmlkjihgfedcba"));
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() <= 1) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);


    }

}
