package practice.Dynamic;

import static java.lang.Integer.MIN_VALUE;

public class maxProfit_123 {
    public int maxProfit(int[] prices) {
        if (prices.length<2) return 0;
        int[][][] dp = new int[prices.length][2][3];
        dp[0][0][0] = 0;
        dp[0][1][0] = -prices[0];
        dp[0][0][1] = dp[0][1][1] = Integer.MIN_VALUE;//不可能
        dp[0][0][2] = dp[0][1][2] = Integer.MIN_VALUE;//不可
        for (int i = 1; i <prices.length ; i++) {
            dp[i][0][0] = 0;
            dp[i][0][1] = Math.max(dp[i-1][0][1],dp[i-1][1][0]+prices[i]);
            dp[i][0][2] = Math.max(dp[i-1][0][2],dp[i-1][1][1]+prices[i]);
            dp[i][1][0] = Math.max(dp[i-1][1][0],dp[i-1][0][0]-prices[i]);
            dp[i][1][1] = Math.max(dp[i-1][1][1],dp[i-1][0][1]-prices[i]);
            dp[i][1][2] = Integer.MIN_VALUE;
        }
        return Math.max(0,Math.max(dp[prices.length-1][0][1],dp[prices.length-1][0][2]));
    }
}
