package org.example;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arrNum  = {6, 5, 2, 1, 9, 01, 0};

        System.out.println(Arrays.toString(arrNum));
        sSort(arrNum);
        System.out.println(Arrays.toString(arrNum));
    }

    public static void sSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mIndex = i;
            int min = arr[i];

            for (int j = i+ 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    mIndex = j;
                }
            }

            //swap the values of i and smallest element
            int tmp = arr[i];
            arr[i] = arr[mIndex];
            arr[mIndex] = tmp;
        }
    }

}
