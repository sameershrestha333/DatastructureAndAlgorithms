package leetcode.E_344_Reverse_String;

public class ReverseString {
    public void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < s.length / 2; i++) {
            char lastChTemp = s[length - i - 1];
            s[length - i - 1] = s[i];
            s[i] = lastChTemp;
        }
    }
}
