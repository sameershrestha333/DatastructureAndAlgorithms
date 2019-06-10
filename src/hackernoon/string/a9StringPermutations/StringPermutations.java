package hackernoon.string.a9StringPermutations;

public class StringPermutations {

    public static void main(String[] args) {
        String input = "ABC";
        permutation(input);
    }

    private static void permutation(String input) {
        printPermutation("", input);
    }

    private static void printPermutation(String perm, String words) {
        if (words.isEmpty())
            System.out.println(perm);

        int len = words.length();
        for (int i = 0; i < len; i++) {
            printPermutation(perm + words.charAt(i), words.substring(0, i) + words.substring(i + 1, len));
        }

    }
}
