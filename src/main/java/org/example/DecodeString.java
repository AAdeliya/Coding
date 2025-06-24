package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {
    public String decodeString(String s) {

                StringBuilder ans = new StringBuilder();
                Deque<String> st = new ArrayDeque<>();

                for (char a : s.toCharArray()) {
                    if (a != ']') {
                        st.addLast(String.valueOf(a));
                    } else {
                        StringBuilder temp = new StringBuilder();
                        while (!st.peekLast().equals("[")) {
                            temp.append(st.removeLast());
                        }
                        temp.reverse();
                        st.removeLast(); // remove the '['

                        StringBuilder num = new StringBuilder();
                        while (!st.isEmpty() && Character.isDigit(st.peekLast().charAt(0))) {
                            num.append(st.removeLast());
                        }
                        int n = Integer.parseInt(num.reverse().toString());
                        String repeated = temp.toString().repeat(n);
                        for (char c : repeated.toCharArray()) {
                            st.addLast(String.valueOf(c));
                        }
                    }
                }

                while (!st.isEmpty()) {
                    ans.append(st.removeFirst());
                }
                return ans.toString();
            }
        }

