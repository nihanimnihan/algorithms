package java.challenges.arraysAndStrings;

public class PalindromeDetector {

    public boolean isPalindrome(String text) {

        char[] textChar = text.toCharArray();
        for (int i= 0; i < textChar.length / 2; i++) {
            if (textChar[i] != textChar[textChar.length - i - 1]) {
                return false;
            }
        }
        return true;

       /* // first and last letters must match...and each subsequent letter as we walk in.
        // but we only need to walk 1/2 the loop (as the later half will be the same as the first)

        char[] content = text.toCharArray();
        int length = content.length;

        for (int i = 0; i < length / 2; i++) {
            if (content[i] != content[length - i - 1]) {
                return false;
            }
        }
        return true;*/
    }

}
