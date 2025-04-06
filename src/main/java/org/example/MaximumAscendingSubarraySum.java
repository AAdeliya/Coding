package org.example;

public class MaximumAscendingSubarraySum {
    public int MaximumAscendingSubarraySum(int[] nums) {
        int sum = 0;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                current += nums[i];


            } else {
                sum = Math.max(sum, current);
                current = nums[i];
            }

        }

        return Math.max(sum, current);
    }
}
