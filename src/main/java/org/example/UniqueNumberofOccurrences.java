package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0)  + 1);
        }

        for (int a : arr) {
            set.add(a);
        }

        if (map.size() != set.size()) {
            return false;
        }

        return true;
    }
}
