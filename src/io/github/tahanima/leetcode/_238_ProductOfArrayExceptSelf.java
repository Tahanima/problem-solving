package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        int product = 1;

        for (int i = 0; i < size; i++) {
            answer[i] = product;
            product *= nums[i];
        }

        product = 1;
        for (int i = size - 1; i >= 0; i--) {
            answer[i] *= product;
            product *= nums[i];
        }

        return answer;
    }
}
