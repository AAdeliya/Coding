package org.example;

public class SubarrayProductLessThanK {
    public int subbarrayProductlessThsnK(int[] nums, int k) {
        if (k <= 1) return 0;

        int count = 0;
        int product = 0;

        for (int left = 0, right = 0; right < nums.length; right++) {
            product *= nums[right++];

            while (product >= k) {
                product /= nums[left++];
            }

            count += right - left + 1;
        }

        return count;
    }

}
