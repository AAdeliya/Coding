package org.example;

import java.util.Arrays;

public class AssignCookies {
    public int findContentchildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (g[child] < g.length && s[cookie] < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }

            cookie++;
        }

        return child;
    }
}
