package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveLength {
    public int longest(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int longest = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int start = n;
                int end = n;

                while (set.contains(end + 1)) {
                    end++;
                }

                longest = Math.max(longest, end - start + 1);
            }
        }
        return longest;
    }
}
