package org.example;

public class FindPivotIndex {
    public int findPivot(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;

        }
        for (int i = 0; i < nums.length; i++) {
            int leftTotal = 0;
            int rightSum = total - leftTotal - nums[i];
            if (rightSum == leftTotal) {
                return i;
            }

            leftTotal += nums[i];
        }

        return -1;

    }
}
