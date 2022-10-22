package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _926_FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int[] countOfZeros = new int[n];
        int[] countOfOnes = new int[n];
        int i = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                countOfZeros[i] = 1;
            } else {
                countOfOnes[i] = 1;
            }

            if (i > 0) {
                countOfZeros[i] += countOfZeros[i - 1];
                countOfOnes[i] += countOfOnes[i - 1];
            }

            i++;
        }

        int min = Math.min(countOfZeros[n - 1], countOfOnes[n - 1]);

        for (i = 0; i < n; i++) {
            int temp = countOfOnes[i];
            temp += countOfZeros[n - 1] - countOfZeros[i];
            min = Math.min(min, temp);
        }

        return min;
    }
}
