package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _813_LargestSumOfAverages {
    int[] _nums;
    double[][] dp = new double[105][105];
    int n, K;

    public double solve(int i, int partition) {
        if (i >= n) {
            return 0;
        } else if (dp[i][partition] > -1.0) {
            return dp[i][partition];
        } else {
            if (partition < K) {
                double avg = 0.0, current = 0.0;
                int count = 0;

                for (int j = i; j < n; j++) {
                    current += _nums[j];
                    count++;

                    avg = Math.max(avg, (current / count) + solve(j + 1, partition + 1));
                }

                return dp[i][partition] = avg;

            } else {
                double avg = 0.0;

                for (int j = i; j < n; j++) {
                    avg += _nums[j];
                }

                return dp[i][partition] = avg / (n - i);
            }
        }
    }

    public double largestSumOfAverages(int[] nums, int k) {
        _nums = nums;
        n = nums.length;
        K = k - 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = -1.0;
            }
        }

        return solve(0, 0);
    }
}
