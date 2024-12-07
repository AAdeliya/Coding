package org.example;

public class relativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count[] = new int[1001];
        int maximum = 0;
        int i = 0;

        for (int j : arr1) {
            count[j]++;
            maximum = Math.max(maximum, j);
        }

        for (int p : arr2)
            while (count[p]-- > 0)
                arr1[i++] = p;
            for (int j = 0; j <= maximum; j++)
                while (count[j]-- > 0)
                    arr1[i++] = j;
            return arr1;
        }
    }

