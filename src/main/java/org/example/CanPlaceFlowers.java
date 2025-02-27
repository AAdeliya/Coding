package org.example;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbeds, int n) {
        for (int i = 0; i < flowerbeds.length; i++) {
            boolean left = i == 0 || flowerbeds[i - 1] == 0;
            boolean right = i == flowerbeds.length - 1 || flowerbeds[i + 1] == 0;

            if (left && right && flowerbeds[i] == 0) {
                flowerbeds[i] = 1;
                n--;
            }
        }

        return n <= 0;
    }

}
