package io.github.tahanima.leetcode;

import java.util.Arrays;

/**
 * @author tahanima
 */
public class _217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }

        return false;
    }
}
