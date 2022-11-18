package io.github.tahanima.leetcode;

import java.util.*;

/**
 * @author tahanima
 */
public class _18_4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> hs = new HashSet<>();

        for (int i = 0; i <= n - 4; i++) {
            for (int j = i + 1; j <= n - 3; j++) {
                int lo = j + 1, hi = n - 1;

                while (lo < hi) {
                    long sum = (long)nums[i] + (long)nums[j] + nums[lo] + nums[hi];

                    if (sum == target) {
                        ArrayList<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(nums[i]);
                        quadruplet.add(nums[j]);
                        quadruplet.add(nums[lo]);
                        quadruplet.add(nums[hi]);

                        Collections.sort(quadruplet);
                        hs.add(quadruplet);

                        lo++;
                    } else if (sum < target) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }

        return new ArrayList<>(hs);
    }
}
