package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _2413_SmallestEvenMultiple {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public int smallestEvenMultiple(int n) {
        return lcm(2, n);
    }
}
