package io.github.tahanima.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author tahanima
 */
public class _494_TargetSum {
    int[] nums;
    int n, target;
    HashMap<ArrayList<Integer>, Integer> memo = new HashMap<>();

    private int solve(int pos, int sum) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(pos);
        aList.add(sum);

        if (pos >= n) {
            if (sum == target) {
                return 1;
            }

            return 0;
        } else if (memo.containsKey(aList)) {
            return memo.get(aList);
        } else {
            int ans = solve(pos + 1, sum + nums[pos]) + solve(pos + 1, sum - nums[pos]);
            memo.put(aList, ans);

            return ans;
        }
    }

    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums;
        n = nums.length;
        this.target = target;

        return solve(1, nums[0]) + solve(1, -nums[0]);
    }
}
