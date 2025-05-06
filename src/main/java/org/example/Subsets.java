package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> finalSubsets = new ArrayList<>();
        comb(nums, 0, finalSubsets, list);
        return finalSubsets;
    }

    private void comb(int[] nums, int index, List<List<Integer>> finalSubsets, List<Integer> list) {
        if (index == nums.length) {
            finalSubsets.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        comb(nums, index + 1, finalSubsets, list);
        list.remove(list.size() - 1);
        comb(nums, index + 1, finalSubsets, list);
    }
}
