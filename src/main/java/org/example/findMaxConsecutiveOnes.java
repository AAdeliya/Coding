package org.example;

public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int val : nums) {
            if (val == 1) {
                count++;
            } else {
                count = 0;
                max = Math.max(max, count);
            }
        }

        return Math.max(max, count);
    }
}
