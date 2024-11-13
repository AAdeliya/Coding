package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
       slidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7},  3);
        System.out.println();

    }
    public static int[] slidingWindow(int[] a, int k) {
        if (a == null || k <= 0) {
            return new int[0];
        }
        int n = a.length;
        int [] r = new int[n-k+1];
        int ri = 0;

        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i<a.length; i++) {
            while (!q.isEmpty() && q.peekFirst() < i - k +1) {
                q.pollFirst();
            }
            while (!q.isEmpty() && a[i] > a[q.peekLast()]) {
                q.pollLast();
            }

            q.offer(i);
            if (i>= k -1) {
                r[ri++] = a[q.peekFirst()];
            }
        }
        return r;

    }

}
