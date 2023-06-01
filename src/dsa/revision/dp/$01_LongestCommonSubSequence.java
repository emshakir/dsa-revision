package dsa.revision.dp;

import java.util.Arrays;

public class $01_LongestCommonSubSequence {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int[][] dp = new int[s1.length()][s2.length()];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        getLongestCommonSubSequence(s1, s2, s1.length(), s2.length());
        memoization(s1, s2, s1.length(), s2.length(), dp);

    }

    public static int memoization(String s1, String s2, int m, int n, int[][] dp) {

        if (m == 0 || n == 0) {
            return 0;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        return 0;
    }

    public static int getLongestCommonSubSequence(String s1, String s2, int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return 1 + getLongestCommonSubSequence(s1, s2, i - 1, j - 1);
        } else {
            int a = getLongestCommonSubSequence(s1, s2, i - 1, j);
            int b = getLongestCommonSubSequence(s1, s2, i, j - 1);
            return Math.max(a, b);
        }
    }
}


/*

    a b c d e               a c e



    1. Any of string is empty -> 0
    2. each strings positions, i - 1, j - 1
    3. s1.charAt(i) != s2.charAt(j) - 
        

 */
