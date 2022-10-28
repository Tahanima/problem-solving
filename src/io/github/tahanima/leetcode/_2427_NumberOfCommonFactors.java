package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _2427_NumberOfCommonFactors {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public int commonFactors(int a, int b) {
        int g = gcd(a, b);
        int ans = 0;

        for (int i = 1; i <= g; i++) {
            if ((g % i) == 0) {
                ans++;
            }
        }

        return ans;
    }
}
