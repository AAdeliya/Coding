package org.example;

import java.util.*;

public class SecondLargestDigitInAAstring {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int num = ch - '0';
                set.add(num);
            }
        }

        if (set.size() < 2) {
            return -1;
        }

        List<Integer> convertedDigits = new ArrayList<>(set);
        Collections.sort(convertedDigits);

        return  convertedDigits.get(convertedDigits.size() - 2);

    }
}
