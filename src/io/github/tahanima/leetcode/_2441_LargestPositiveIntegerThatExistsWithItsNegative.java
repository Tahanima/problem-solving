package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _2441_LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        int MAX = 2005;
        int N = 1000;
        int[] frequency = new int[MAX];

        int ans = -1;
        for (int n: nums) {
            if (frequency[N - n] > 0) {
                ans = Math.max(ans, Math.max(n, -n));
            }

            frequency[N + n]++;
        }

        return ans;
    }
}
