package com.crpoon.leetcode.medium;

public class CoinChange_322 {
	public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }
        
        int[] dpArr = new int[amount + 1];
        dpArr[0] = 0;
        for (int total = 1; total <= amount; total++) {
            int min = Integer.MAX_VALUE;
            for (Integer coin : coins) {
                int diff = total - coin;
                if ((diff > 0 && dpArr[diff] > 0) || diff == 0) {
                    min = Math.min(min, dpArr[diff] + 1);
                }
            }
            dpArr[total] = (min == Integer.MAX_VALUE ? -1 : min);
        }
        return dpArr[amount];
    }
}
