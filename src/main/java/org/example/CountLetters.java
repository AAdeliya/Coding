package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {

    }

    public static Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> letters = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (letters.containsKey(ch)) {
                // if map already contains the key, get the value and put back with +1
                letters.put(ch, letters.get(ch) + 1);
            } else {
                letters.put(ch, 1);
            }
        }

        return letters;
    }
}
