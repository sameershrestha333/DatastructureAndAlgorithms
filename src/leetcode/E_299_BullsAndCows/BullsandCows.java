package leetcode.E_299_BullsAndCows;

public class BullsandCows {
    /**
     * "1807"
     * "7810"
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(getHint("011", "110"));
    }

    public static String getHint(String secret, String guess) {
        final char[] secretArr = secret.toCharArray();
        final char[] guessArr = guess.toCharArray();
        int coutA = 0, countB = 0;
        for (int i = 0; i < guessArr.length; i++) {
            if (guessArr[i] == secretArr[i]) {
                coutA++;
                secretArr[i] = ' ';
                guessArr[i] = ' ';
            }
        }
        for (int i = 0; i < guessArr.length; i++) {
            if (guessArr[i] != ' ') {
                for (int j = 0; j < secretArr.length; j++) {
                    if (guessArr[i] == secretArr[j]) {
                        countB++;
                        secretArr[j] = ' ';
                        break;
                    }
                }
            }
        }
        return coutA + "A" + countB + "B";
    }
}
