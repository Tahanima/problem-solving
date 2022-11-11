package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _647_PalindromicSubstrings {
    public int countSubstrings(String s) {
        int n = s.length();
        long[] hash = new long[n];
        long[] hashReverse = new long[n];
        long[] pow = new long[n];
        long mod = 1000_000_000 + 9;
        long p = 31;

        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * p) % mod;
        }

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            hash[i] = ((s.charAt(i) - 'a' + 1) * pow[i]) % mod;
            hashReverse[j] = ((s.charAt(j) - 'a' + 1) * pow[i]) % mod;

            if (i > 0) {
                hash[i] = (hash[i] + hash[i - 1]) % mod;
            }

            if (j < (n - 1)) {
                hashReverse[j] = (hashReverse[j] + hashReverse[j + 1]) % mod;
            }

        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j + i - 1 < n; j++) {
                int l = j, r = j + i - 1;
                long h0 = hash[r];

                if (l > 0) {
                    h0 -= hash[l - 1];
                    h0 = (h0 + mod) % mod;
                }

                long h1 = hashReverse[l];

                if (r < n - 1) {
                    h1 -= hashReverse[r + 1];
                    h1 = (h1 + mod) % mod;
                }

                if (n - r - 1 > l) {
                    h0 = (h0 * pow[n - r - 1 - l]) % mod;
                } else if (n - r - 1 < l) {
                    h1 = (h1 * pow[l - (n - r - 1)]) % mod;
                }

                if (h0 == h1) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
