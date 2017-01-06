package com.crpoon.leetcode.medium;

public class WaterAndJugProblem_365 {
	public boolean canMeasureWater(int x, int y, int z) {
        if (z > x + y) {
            return false;
        }
        
        if (z == x || z == y || z == x+y) {
            return true;
        }
        
        return z % GCD(x,y) == 0;
    }
    
    private int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
