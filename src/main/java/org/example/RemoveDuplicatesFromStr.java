package org.example;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicatesFromStr {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public static String removeDup(String str) {
        StringBuilder strNoDup = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!strNoDup.toString().contains(String.valueOf(ch))) {
                strNoDup.append(ch);
            }
        }

        return strNoDup.toString();
    }

    //or do it with Set
    public static String removeDupWithSet(String str) {
        StringBuilder strNoDup = new StringBuilder();

        char[] letters = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        for (Character ch : set) {
            strNoDup.append(ch);
        }

        return  strNoDup.toString();
    }


}
