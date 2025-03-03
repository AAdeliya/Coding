package org.example;

public class TrappingRainWaterTwoPointers {
    public int trap(int[] arr)  {
    int l = 0; int r = arr.length - 1;
    int lmax = 0, rmax = 0, ans = 0;

    while ( l < r) {
        lmax = Math.max(lmax, arr[l]);
        rmax = Math.max(rmax, arr[r]);

        if (lmax < rmax) {
            ans += lmax - arr[l];
            l++;
        } else {
            ans += rmax - arr[r];
            r--;
        }
    }

    return ans;
}}
//We always process the side with the smaller max boundary
// first because it determines the minimum water level at that index.

//Time Complexity: O(n) (Each element is processed once).
//Space Complexity: O(1) (No extra arrays used).