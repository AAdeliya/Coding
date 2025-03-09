package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConceptualApproachtoFindingtheFirstMissingPositiveInteger {
    public int firstMissingPositive(int[] nums) {
        //create a list with positive numbers
        //[3, 4, - 1, 1]
        //[3, 4, 1]
        List<Integer> numsList = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                numsList.add(nums[i]); // we are adding all positive numbers

            }

        }

        for (int i = 0; i < numsList.size(); i++) {
            //n - idx getting absolute value of n and  - 1--> it converts the value n to a zeo - based index

            int n = Math.abs(numsList.get(i));
            //if idx is within the bounds of the list and the value idx is positive
            //then the algorithm marks the presence of the number by negating value at nums[idx]
            //by negating the values.
            //the algorithm effictively marks that a number corresponding to this
            //index exists in the array, without using extra space

            if (n <= numsList.size() && numsList.get(n - 1) > 0) {
                numsList.set(n - 1, -numsList.get(n - 1));

            }
        }
        //checking all elements in the list
        //if an element is found to be positive
        //it indicates that the index i +1 is the first missing positive
        //integer because this index was not marked in the
        //previous step

        for (int i = 0; i < numsList.size(); i++) {

            //[-3, 4, -1]
            //i = 0, nums[0] --> loop continues
            //i = 1, nums[1] --> is positive,
            // indicating that 2 is the first missing positive integer
            if (numsList.get(i) > 0) {
                return i + 1;
            }
        }
        //if the loop competes without finding a missing positive integer
        //it means all integers from 1 to len(nums) are present in the array
        //therefore, the first missing positive integer would be len(nums) + 1

        //example [1,2,3]
        //return 4

        return numsList.size() + 1;


        //algorithm determines the smallest missing positive integer by
        //using the existing array space to mark the presence of element
        //the approach eliminates the need for additional space and provides
        //an optimal solution to the problem
    }
}


//
//
//List<Integer> numsList = new ArrayList<Integer>();
//
//        for (int i = 0; i < nums.length; i++) {
//        if (nums[i] > 0) {
//        numsList.add(nums[i]);
//            }
//                    }
//
//                    for (int i = 0; i < numsList.size(); i++) {
//int n = Math.abs(numsList.get(i));
//            if (n <= numsList.size() && numsList.get(n - 1) > 0) {
//        numsList.set(n - 1, -numsList.get(n - 1));
//        }
//        }
//
//        for (int i = 0; i < numsList.size(); i++) {
//        if (numsList.get(i) > 0) {
//        return i + 1;
//        }
//        }
//
//        return numsList.size() + 1;
//        }
//        }