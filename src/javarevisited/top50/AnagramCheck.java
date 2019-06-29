package javarevisited.top50;

import java.util.Arrays;

public class AnagramCheck {

    public static boolean isAnagramEasy(String word, String anagram) {

        if (word.length() != anagram.length())
            return false;

        char[] chars1 = word.toCharArray();
        char[] chars2 = word.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);

    }

    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }

        char[] wordsArrays = word.toCharArray();
        for (char ch : wordsArrays) {
            int index = anagram.indexOf(ch);
            if (index == -1) {
                return false;
            } else {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            }
        }

        return anagram.isEmpty();
    }
}
