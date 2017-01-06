package com.crpoon.leetcode.easy;

public class BestTimeToBuyAndSellStock_121 {
	public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        
        int maxProfit = 0;
        int bought = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bought) {
                maxProfit = Math.max(maxProfit, prices[i] - bought);
            } else {
                bought = prices[i];
            }
        }
        return maxProfit;
    }
}
