package org.example;

public class TrappingRainWater {
    public int trap(int[] arr) {

        //first approach
        int n = arr.length;
        int[] lmax = new int[n];
        lmax[0] = arr[0];
        for (int i = 0; i < n; i++) {
            //we reuse this stored value and just compare it with arr[i].
            lmax[i] = Math.max(lmax[i - 1], arr[i]);

            int[] rmax = new int[n];
            rmax[n - 1] = arr[n - 1];  // Step 1: Initialize last element
            for (int i = n - 2; i >= 0; i--)  // Step 2: Fill rmax from right to left
                rmax[i] = Math.max(rmax[i + 1], arr[i]);


            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.min(lmax[i], rmax[i] = arr[i]);

                return ans;
            }
        }
    }
    }


    //Two pointers approach

}
