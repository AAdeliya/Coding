package org.example;

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); //base case to handle subarrays strating at index 0

        int maxLen = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += (nums[i] == 0) ? - 1: 1;

            if (map.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum));

            } else {
                map.put(prefixSum, i); //store first occurence only
            }
        }

        return maxLen;

     }
}
