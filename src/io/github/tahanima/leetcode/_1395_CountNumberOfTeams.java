package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _1395_CountNumberOfTeams {
    int MAXN = 100005;
    int[] BIT = new int[MAXN];

    public void update(int x, int delta) {
        for(; x < MAXN; x += x&-x) {
            BIT[x] += delta;
        }
    }

    public int query(int x) {
        int sum = 0;

        for(; x > 0; x -= x&-x) {
            sum += BIT[x];
        }

        return sum;
    }

    public int numTeams(int[] rating) {
        int n = rating.length;
        int[] greater = new int[n];
        int[] less = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            greater[i] = query(MAXN - 1) - query(rating[i]);
            update(rating[i], 1);
        }

        for (int i = 0; i < MAXN; i++) {
            BIT[i] = 0;
        }

        for (int i = n - 1; i >= 0; i--) {
            less[i] = query(rating[i] - 1);
            update(rating[i], 1);
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (rating[i] < rating[j]) {
                    answer += greater[j];
                }

                if (rating[i] > rating[j]) {
                    answer += less[j];
                }
            }
        }

        return answer;
    }
}
