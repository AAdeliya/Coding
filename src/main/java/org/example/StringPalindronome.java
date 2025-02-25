package org.example;

public class StringPalindronome {
    public static void main(String[] args) {
        System.out.println(isPal("anna"));
        System.out.println(isPal("civic"));
    }

    public static boolean isPal(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
