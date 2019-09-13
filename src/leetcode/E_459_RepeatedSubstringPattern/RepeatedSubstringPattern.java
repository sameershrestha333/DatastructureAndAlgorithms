package leetcode.E_459_RepeatedSubstringPattern;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabc"));
    }

    public static boolean repeatedSubstringPattern(String str) {

        String s = str + str;
        return s.substring(1, s.length() - 1).contains(str);
    }
}
