package dsa.revision.strings;

import java.util.Arrays;

public class $04_LongestCommonPrefix_14 {

    public static void main(String[] args) {
        String[] input = {"czabc", "czal", "czabcd", "czacae", "cbyz", "czalmn", "czacbe", "czz"};
        System.out.println("Result: " + getLongestCommonPrefix(input));
    }

    private static String getLongestCommonPrefix(String[] input) {

        Arrays.sort(input);
        System.out.println("Sorted Array: " + Arrays.toString(input));
        String s1 = input[0];
        String s2 = input[input.length - 1];
        int idx = 0;

        /*
            s1 = cbyz
            s2 = czz
        
            idx < s2.length() - 1, save us some unnecessary comparisons, 
            especially when the first and last strings are very different.
        
         */
        while (idx < s1.length() - 1 && idx < s2.length() - 1) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }

        return s1.substring(0, idx);
    }
}
