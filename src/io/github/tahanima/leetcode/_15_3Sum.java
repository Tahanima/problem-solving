package io.github.tahanima.leetcode;

import java.util.*;

/**
 * @author tahanima
 */
public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int num = -(nums[i] + nums[j]);

                if (j == (n - 1)) {
                    continue;
                }

                if (Arrays.binarySearch(nums, j + 1, n, num) >= 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(num);

                    Collections.sort(triplet);
                    hs.add(triplet);
                }
            }
        }

        return new ArrayList<>(hs);
    }
}
