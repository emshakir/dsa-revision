package dsa.revision.strings;

import java.util.HashMap;
import java.util.Map;

public class $02_ValidAnagram_242 {

    public static void main(String[] args) {

    }

    public static boolean isValidAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> dict = new HashMap<>();
        for (char c : s.toCharArray()) {
            dict.put(c, dict.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            int count = dict.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            } else {
                dict.put(c, count - 1);
            }
        }

        return true;
    }
}
