package org.example;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        int minElement = Arrays.stream(nums).min().getAsInt();
        int moves = 0;

        for (int num : nums) {
            moves += (num - minElement);
        }

        return moves;
    }
}
