package hackernoon.string.a5isDigits;

import java.util.regex.Pattern;

public class RegularExpressionExample {
    public static void main(String[] args) {
        String[] inputs = {"123", "-123", "123.12", "abcd123"};

        String regex = "[0-9]+";
        //String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);

        for (String input : inputs) {
            System.out.println("Is " + input + " is number ? "
                    + pattern.matcher(input).matches());
        }
    }
}
