package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _1653_MinimumDeletionsToMakeStringBalanced {
    int MAXN = 100005;
    int[][] dp = new int[MAXN][2];

    public int solve(int i, int hasB, String s) {
        if (i == s.length()) {
            return 0;
        } else if(dp[i][hasB] > -1) {
            return dp[i][hasB];
        } else {
            if (s.charAt(i) == 'a') {
                if (hasB > 0) {
                    return dp[i][hasB] = 1 + solve(i + 1, hasB, s);
                } else {
                    return dp[i][hasB] = solve(i + 1, hasB, s);
                }
            } else {
                return dp[i][hasB] = Math.min(1 + solve(i + 1, hasB, s),solve(i + 1, Math.min(hasB + 1, 1), s));
            }
        }
    }

    public int minimumDeletions(String s) {
        for (int i = 0; i < s.length() + 1; i++) {
            dp[i][0] = dp[i][1] = -1;
        }

        return solve(0, 0, s);
    }
}
