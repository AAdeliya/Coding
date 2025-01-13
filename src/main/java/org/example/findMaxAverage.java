package org.example;

public class findMaxAverage {
    public int findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (i >= k - 1) {
                maxValue = Math.max(maxValue, sum);
                sum -= nums[i] - (k - 1);
            }
        }

        return (double) maxValue/k;
    }
}
