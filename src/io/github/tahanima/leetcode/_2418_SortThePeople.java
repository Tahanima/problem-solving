package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _2418_SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int MAX = 100001;
        int n = names.length;
        String[] ans = new String[n];
        String[] temp = new String[MAX];

        for (int i = 0; i < n; i++) {
            temp[heights[i]] = names[i];
        }

        int idx = 0;
        for (int i = MAX - 1; i >= 0; i--) {
            if (temp[i] != null) {
                ans[idx++] = temp[i];
            }
        }

        return ans;
    }
}
