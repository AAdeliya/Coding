package org.example;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairs {
    public int climbStairs(int n) {
        //intuitive but inefficient (o(2n)
        if (n <= 1) return 1;
        return climbStair(n - 1) + climbStair(n - 2);
    }

    //Memoization (top- down dp)
    Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        int ways = climbStairs((n - 1) + climbStair(n - 2));
        memo.put(n, ways);
        return ways;

    }
}

//Bottom Up DP O(n)
    public int climbStairs(int n) {
    if (n <= 1) return 1;
    int[] dp = new int[n + 1];
    dp[0] = dp[1]  = 1;
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
    }


    //space complexity o(1)
    //time complexity O(N)
//space optimized DP(Fibonacci style)
    public int climbStair(int n) {
        if (n <= 1) return 1;

        int prev1 = 1;  //f(0)
        int prev2 = 1;  //f(1)
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;

        }

        return prev1;
    }
}

//Mathematical formula (closed form/Binet's formula)
///time o(1)
//space o(1)
//risk of floating oiunt precision errors for large n
public int climbStairs(int n) {
    double sqrt5 = Math.sqrt(5);
    double phi = (1 + sqrt5) / 2;
    double psi = (1 - sqrt5) / 2;
    return (int) Math.round((Math.pow(phi, n + 1) - Math.pow(psi, n + 1)) / sqrt5);

}