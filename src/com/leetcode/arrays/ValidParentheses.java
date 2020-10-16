package com.leetcode.arrays;

import java.util.Stack;

/**
 * @author Chayanika Ghosh
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() == 0 || s.length() == 1) {
            return false;
        }
        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (((!st.empty()) && (st.peek() == '(')) && (s.charAt(i) == ')')) {
                st.pop();
            } else if ((!st.empty()) && st.peek() == '{' && s.charAt(i) == '}') {
                st.pop();
            } else if ((!st.empty()) && st.peek() == '[' && s.charAt(i) == ']') {
                st.pop();
            }
        }
        if (!st.isEmpty()) {
            if(st.peek() == '{' || st.peek() == '[' || st.peek() == '('){
                return false;
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;

        }

    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        String input = "(])";
        boolean result = obj.isValid(input);
        System.out.println(result);
    }
}
