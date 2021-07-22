package practice.Dynamic;

public class coinChange_322 {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        for (int i = 1; i < amount+1; i++) {
            if (i%coins[0]==0) dp[i] = i/coins[0];
            else
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < coins.length; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (j>=coins[i]&&dp[j-coins[i]]!=Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]==Integer.MAX_VALUE ? -1 :dp[amount];
    }
}
