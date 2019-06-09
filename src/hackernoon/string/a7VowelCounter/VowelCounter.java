package hackernoon.string.a7VowelCounter;

public class VowelCounter {
    public static void main(String[] args) {
        String input = "aeiouzzz";
        int output = countVowel(input);
        System.out.println("The number of volwe in " + input + " is : " + output);
    }

    private static int countVowel(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    // no count
            }

        }


        return count;
    }
}
