package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            maxSum = Math.max(sum, maxSum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}
