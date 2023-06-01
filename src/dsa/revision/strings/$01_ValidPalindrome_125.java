package dsa.revision.strings;

public class $01_ValidPalindrome_125 {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char leftChar, rightChar;

        while (left <= right) {
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (isCharDiff(leftChar, rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    private static boolean isCharDiff(char leftChar, char rightChar) {
        return Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar);
    }

}
