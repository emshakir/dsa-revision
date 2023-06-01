package dsa.revision.arrays;

class $03_ValidPalindrome {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1};
        boolean isPalindrome = isValidPalindrome(arr);
        System.out.println("isPalindrome :: " + isPalindrome);
    }

    public static boolean isValidPalindrome(int[] arr) {

        int si = 0;
        int ei = arr.length - 1;

        while (si < ei) {

            if (arr[si] != arr[ei]) {
                return false;
            }

            si++;
            ei--;
        }
        return true;
    }
}
