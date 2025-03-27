package org.example;

public class MaximumCountofPositiveIntegerandNegativeInteger {
    public int maximymCount(int[] nums) {
        int negative = 0;
        int positive = 0;

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] < 0) {
                negative++;

            } else if (nums[i] == 0) {
                continue;
            } else {
                positive++;
            }

        }

        return Math.max(negative, positive);
    }
}


