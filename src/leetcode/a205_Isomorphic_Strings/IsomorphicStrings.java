package leetcode.a205_Isomorphic_Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        if (sArr.length != tArr.length)
            return false;

        for (int i = 0; i < sArr.length; i++) {
            if (mapS.containsKey(sArr[i])) {
                if (sArr[i] != tArr[i])
                    return false;
            } else if (mapT.containsKey(tArr[i])) {
                if (tArr[i] != sArr[i])
                    return false;
            } else {
                mapS.put(sArr[i], tArr[i]);
                mapT.put(tArr[i], sArr[i]);
            }

        }
        return true;
    }


}