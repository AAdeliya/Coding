package org.example;

public class UniquePaths {
    public int uniquePath(int m, int n) {
        //recursion dfs
        //time complexity O(M x N)
        int[][] memo = new int[m][n];
        return dfs(0, 0, m , n, memo);
    }

    private int dfs(int i, int j, int m, int n, int[][] memo) {
        if (i >= m || j >= n) return 0;
        if (i == m - 1 || j == n - 1) return 1;
        if (memo[i][j] > 0) return memo[i][j];

        memo[i][j] = dfs(i+1, j , m ,n, memo) + dfs(i ,j+ 1, m ,n, memo);
        return memo[i][j];
    }
}
