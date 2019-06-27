package javarevisited.top50;

public class PalindromeString {

    public static void main(String args[]) {
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";

        System.out.println(isPalindrome(input1));
        System.out.println(isPalindrome(input2));

    }

    private static boolean isPalindrome(String input) {
        String validString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("Data ::" + validString);
        int length = validString.length();
        for (int i = 0; i < length; i++) {
            if (validString.charAt(i) != validString.charAt(length - i - 1))
                return false;
        }

        return true;
    }
}
