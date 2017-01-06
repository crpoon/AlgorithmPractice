package com.crpoon.hackerrank.cracking;

import java.util.Scanner;

public class DPCoinChange {
	public static long makeChange(int[] coins, int money) {
        long dp[] = new long[money + 1];
        dp[0] = (long) 1;
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for (int j = coin; j <= money; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[money];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }
}
