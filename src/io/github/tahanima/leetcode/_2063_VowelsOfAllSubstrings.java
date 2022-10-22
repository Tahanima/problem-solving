package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _2063_VowelsOfAllSubstrings {
    public long countVowels(String word) {
        long sum = 0;
        long prev = 0;
        int count = 1;

        for (char ch : word.toCharArray()) {
            if ("aeiou".contains("" + ch)) {
                prev += count;
            }

            sum += prev;
            count++;
        }

        return sum;
    }
}
