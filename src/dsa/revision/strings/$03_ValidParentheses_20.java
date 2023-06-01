package dsa.revision.strings;

import java.util.Stack;

public class $03_ValidParentheses_20 {

    public static void main(String[] args) {

    }

    private static boolean hasValidParenthesisOpt(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(') {
                s.push(')');
            } else if (ch == '{') {
                s.push('}');
            } else if (ch == '[') {
                s.push(']');
            } else if (s.isEmpty() || ch != s.pop()) {
                return false;
            }
        }
        return s.isEmpty();
    }

    private static boolean hasValidParentheses(String input) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                charStack.push(ch);
            } else {

                // if the string start with }{ - it is false
                if (charStack.isEmpty()) {
                    return false;
                }

                if (charStack.peek() == '(' && ch == ')'
                        || charStack.peek() == '[' && ch == ']'
                        || charStack.peek() == '{' && ch == '}') {
                    charStack.pop();
                } else {
                    return false;
                }

            }
        }
        return charStack.isEmpty();
    }
}
