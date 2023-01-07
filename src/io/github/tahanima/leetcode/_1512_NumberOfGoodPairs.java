package io.github.tahanima.leetcode;

import java.util.HashMap;

/**
 * @author tahanima
 */
public class _1512_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;

        for (int n : nums) {
            if (hm.containsKey(n)) {
                int count = hm.get(n);
                ans += count++;
                hm.replace(n, count);
            } else {
                hm.put(n, 1);
            }
        }

        return ans;
    }
}
