package org.example;

import java.util.Arrays;

public class maxProductDifference {
    public int maxProductDifference(int[] nums) {
        int maxDifference = 0;
        Arrays.sort(nums);
        maxDifference = (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
        return maxDifference;

        //time complexity NlogN
        //7 ms beats 66.30%



//        Bubble sort 546 ms 5.01% beats
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = n-1; j >=i+1; j--) {
//                if (nums[j] < nums[j-1]) {
//                    int t = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = t;
//
//                }
//            }
//
//        }
//
//        return (nums[n-1] * nums[n-2] - nums[1] * nums[0]);

    }
}
