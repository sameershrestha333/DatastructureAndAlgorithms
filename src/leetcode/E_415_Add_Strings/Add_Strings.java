package leetcode.E_415_Add_Strings;

public class Add_Strings {
    public static void main(String[] args) {
        System.out.println(addStrings("9", "999"));
    }

    public static String addStrings(String num1, String num2) {
        int sum = 0, carry = 0;
        String str = "";
        if (num1.length() > num2.length()) {
            String temp = num2;
            num2 = num1;
            num1 = temp;
        }

        int len1 = num1.length();
        int len2 = num2.length();

        int diff = len2 - len1;
        for (int i = len1 - 1; i >= 0; i--) {
            sum = (num1.charAt(i) - '0') + (num2.charAt(diff + i) - '0') + carry;
            str += (char) ((sum % 10) + '0');
            carry = sum / 10;
        }

        for (int i = len2 - len1 - 1; i >= 0; i--) {
            sum = (num2.charAt(i) - '0') + carry;
            str += (char) ((sum % 10) + '0');
            carry = sum / 10;
        }
        if (carry > 0)
            str += (char) (carry + '0');

        return new StringBuilder(str).reverse().toString();

    }

}
