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

//Dynamic programming
public int uniquePathDP(int m, int n) {
    int[][] dp = new int[m][n];

    for (int i = 0; i < m; i++) dp[i][0] = 1;
    for (int j = 0; j  < n; j++) dp[0][j] = 1;

    for (int i = 1; i < m; i++) {
        for (int j = 0; j < n; j++) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
    }

    return dp[m - 1][n - 1];
}

//Combinatorial approach - time O(min(m,n))
                           //space O(1) - no arrays, no recursion

public int uniquePathCombinatorialApproach(int m , int n) {
    return (int) comb(m + n - 2, Math.min(m - 1, n - 1));

}

private long comb(int a, int b) {
    long res = 1;
    for (int i = 1; i <= b; i++) {
        res = res * (a - i + 1) / i;

    }

    return res;

}

