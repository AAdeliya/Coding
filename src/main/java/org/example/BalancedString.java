package org.example;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println();
    }

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return  false;
                }

                char latestOpenedPar = st.pop();
                if (latestOpenedPar == '{' && ch != '}') { // this for curly braces
                    return false;
                } else if (latestOpenedPar == '(' && ch != ')') { // this for parentheses
                    return false;
                } else if (latestOpenedPar == '[' && ch != ']') { // for square braces
                    return false;
                }
            }
        }
        return st.size() == 0;
    }

}
