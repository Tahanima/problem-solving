package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int [] maxNumFromIndex = new int[size];
        int i = size;

        while (--i >= 0) {
            maxNumFromIndex[i] = (i == (size - 1)) ? prices[i] : Math.max(prices[i], maxNumFromIndex[i + 1]);
        }

        int max = 0;
        for (i = 0; i < size; i++) {
            max = Math.max(max, maxNumFromIndex[i] - prices[i]);
        }

        return Math.max(0, max);
    }
}
