package org.example;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] inputArr = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(inputArr));
        reverseArray(inputArr);
        System.out.println(Arrays.toString(inputArr));

    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
