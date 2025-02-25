package org.example;

import java.util.Arrays;

public class TwoStringAnargam {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }

    public static boolean isAnagram(String str, String str1) {
        char[] arrstr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        Arrays.sort(arrstr);
        Arrays.sort(arrStr1);

        return Arrays.equals(arrstr, arrStr1);

    }
}
