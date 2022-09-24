package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _983_MinimumCostForTickets {
    int[] memo = new int[400];

    public int solve(int i, int[] days, int[] costs) {
        if (i >= days.length) {
            return 0;
        }

        if (memo[i] > 0) {
            return memo[i];
        }

        int ans0 = costs[0];
        int next = days[i] + 1;
        int j = i;

        while (j < days.length && days[j] < next) {
            j++;
        }

        ans0 += solve(j, days, costs);

        int ans1 = costs[1];
        next = days[i] + 7;
        j = i;

        while (j < days.length && days[j] < next) {
            j++;
        }

        ans1 += solve(j, days, costs);

        int ans2 = costs[2];
        next = days[i] + 30;
        j = i;

        while (j < days.length && days[j] < next) {
            j++;
        }

        ans2 += solve(j, days, costs);

        memo[i] = Math.min(Math.min(ans0, ans1), ans2);
        return memo[i];
    }

    public int mincostTickets(int[] days, int[] costs) {
        return solve(0, days, costs);
    }
}
