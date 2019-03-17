package leetcode.fiftyeight.lengthofthelastword;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s) {

        int lenthOfLastWord = 0;

        int length = s.length();
        for(int i = length-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                lenthOfLastWord++;
            } else if(lenthOfLastWord ==0){
                continue;
            }
            else
                break;

        }
        return lenthOfLastWord;


    }

}
