package org.example;

public class MaxMinNumberfromAnArray {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int max(int[] arrNum) {
        int max = arrNum[0];

        for (int n : arrNum) {
            if (max < n) {
                max = n;
            }
        }

        return max;
    }
}

//
//int min = arrNum[0];
//for (int n: arrNum) {
//    if (min > n) {}
//    min = num;
//        }
//        }
//return min;
