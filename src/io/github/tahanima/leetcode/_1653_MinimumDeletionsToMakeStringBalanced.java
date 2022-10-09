package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _1653_MinimumDeletionsToMakeStringBalanced {
    String S;
    int[][] dp = new int[100005][2];

    public int solve(int i, int hasB) {
        if (i == S.length()) {
            return 0;
        } else if(dp[i][hasB] > -1) {
            return dp[i][hasB];
        } else {
            if (S.charAt(i) == 'a') {
                if (hasB > 0) {
                    return dp[i][hasB] = 1 + solve(i + 1, hasB);
                } else {
                    return dp[i][hasB] = solve(i + 1, hasB);
                }
            } else {
                return dp[i][hasB] = Math.min(1 + solve(i + 1, hasB),solve(i + 1, Math.min(hasB + 1, 1)));
            }
        }
    }

    public int minimumDeletions(String s) {
        for (int i = 0; i < s.length() + 1; i++) {
            dp[i][0] = dp[i][1] = -1;
        }

        S = s;

        return solve(0, 0);
    }
}
