package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShoertestsumArray {

    public static void main(String[] args) {
        shorttestsumArray(new int[]{2,-1,2}, 3);
        System.out.println();

    }
    public static int shorttestsumArray(int[] A, int K) {
       // int[] A = {1, 3, 5, 6,-1, -5};
    int N = A.length;
    int res = N+1;
    long[] B = new long [N+1];
        for (int i = 0; i < N; i++) {
            B[i + 1] = B[i] + A[i];  // This way, B[i+1] stays within bounds.
        }


        Deque<Integer> d = new ArrayDeque<>();
    for ( int i = 0; i< N +1 ; i++) {
        while(d.size() > 0 && B[i] - B[d.getFirst()] >=K) {
            res= Math.min(res, i-d.pollFirst());
        }
        while (d.size() > 0 && B[i] <=B[d.getLast()]) {
            d.pollLast();
        }
        d.addLast(i);
    }

    return res <= N ? res : 1;


}}
