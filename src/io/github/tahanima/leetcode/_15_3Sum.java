package io.github.tahanima.leetcode;

import java.util.*;

/**
 * @author tahanima
 */
public class _15_3Sum {
    public void diff(ArrayList<Integer> lis0, ArrayList<Integer> lis1, HashSet<ArrayList<Integer>> hs) {
        int n = lis0.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int num = -(lis0.get(i) + lis0.get(j));

                if (Collections.binarySearch(lis1, num) >= 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(lis0.get(i));
                    triplet.add(lis0.get(j));
                    triplet.add(num);

                    Collections.sort(triplet);
                    hs.add(triplet);
                }
            }
        }
    }

    public void self(ArrayList<Integer> lis0, HashSet<ArrayList<Integer>> hs) {
        int n = lis0.size();
        int[] temp = new int[n];

        for (int i = 0; i < n; temp[i] = lis0.get(i), i++);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int num = -(lis0.get(i) + lis0.get(j));

                if (j == (n - 1)) {
                    continue;
                }

                if (Arrays.binarySearch(temp, j + 1, n, num) >= 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(lis0.get(i));
                    triplet.add(lis0.get(j));
                    triplet.add(num);

                    Collections.sort(triplet);
                    hs.add(triplet);
                }
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> lis0 = new ArrayList<>();
        ArrayList<Integer> lis1 = new ArrayList<>();
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                lis0.add(nums[i]);
            } else {
                lis1.add(nums[i]);
            }
        }

        Collections.sort(lis0);
        Collections.sort(lis1);

        diff(lis0, lis1, hs);
        diff(lis1, lis0, hs);
        self(lis0, hs);
        self(lis1, hs);

        return new ArrayList<>(hs);
    }
}
