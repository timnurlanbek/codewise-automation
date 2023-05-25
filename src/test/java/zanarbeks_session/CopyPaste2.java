package zanarbeks_session;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class CopyPaste2 {
        public static void main(String[] args) {
            String input = "25,071 words 157,117 characters";

            int digitCount = getDigitCountBeforeWord(input, "words");

            System.out.println("Number of digits before 'words': " + digitCount);
        }

        public static int getDigitCountBeforeWord(String input, String word) {
            String patternString = "(\\d+)\\s*" + word;
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String digits = matcher.group(1);
                digits = digits.replace(",", ""); // Remove any commas in the number
                return Integer.parseInt(digits);
            }

            return 0; // Return 0 if the word is not found or no digits are present before it
        }
    }



