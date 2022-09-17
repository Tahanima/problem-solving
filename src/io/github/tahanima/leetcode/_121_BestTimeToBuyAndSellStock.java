package io.github.tahanima.leetcode;

/**
 * @author tahanima
 */
public class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int maxNumFromIndex = 0;
        int max = 0;

        for (int i = size - 1; i >= 0; i--) {
            maxNumFromIndex = (i == size - 1) ? prices[i] : Math.max(maxNumFromIndex, prices[i]);
            max = Math.max(max, maxNumFromIndex - prices[i]);
        }

        return Math.max(0, max);
    }
}
