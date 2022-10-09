package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _1043_PartitionArrayForMaximumSum {
    int[] dp = new int[505];
    int[] _arr;
    int n;
    int K;

    public int solve(int i) {
        if (i >= n) {
            return 0;
        } else if (dp[i] > -1) {
            return dp[i];
        } else {
            for (int j = 1; j <= K; j++) {
                int max = 0, count = 0;

                for (int k = i; k < n && k < i + j; k++) {
                    max = Math.max(max, _arr[k]);
                    count++;
                }

                dp[i] = Math.max(dp[i], max * count + solve(i + j));
            }

            return dp[i];
        }
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        _arr = arr;
        n = arr.length;
        K = k;

        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        return solve(0);
    }
}
