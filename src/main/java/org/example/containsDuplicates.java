package org.example;

import java.util.Arrays;

public class containsDuplicates {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;


    }
}


//Set<Integer> seen = new HashSet<>();
//for (int n : nums) {
//    if (seen.contains(num)) {
//return true;
//        } seen.add(num);
//}
//return false;
//        }
//        }
