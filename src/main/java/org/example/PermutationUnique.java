package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationUnique {
    public List<List<Integer>> uniquePer(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        bactrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    private void bactrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {
       if (tempList.size() == nums.length) {
           list.add(new ArrayList<>(tempList));

    } else {
           for (int i = 0; i  < nums.length; i++) {
               if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;

               used[i] = true;
               tempList.add(nums[i]);
               bactrack(list, tempList, nums, used);
               used[i]  = false;
               tempList.remove(tempList.size() - 1);

           }
       }

}
