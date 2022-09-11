package io.github.tahanima.leetcode;

import java.util.Arrays;

/*
 * @author tahanima
 */
public class _1_TwoSum {
    public class Pair implements Comparable<Pair> {
        public int first;
        public int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            return first - o.first;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        Pair [] numsAndIndices = new Pair[size];

        int i = 0;
        for (int n: nums) {
            numsAndIndices[i] = new Pair(n, i++);
        }

        Arrays.sort(numsAndIndices);

        i = 0;
        size--;

        while (i < size) {
            int received = numsAndIndices[i].first + numsAndIndices[size].first;

            if (received > target) {
                size--;
            } else if (received < target) {
                i++;
            } else {
                return new int[]{numsAndIndices[i].second, numsAndIndices[size].second};
            }
        }

        return new int[0];
    }
}
