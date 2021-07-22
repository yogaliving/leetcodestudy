package practice.Dynamic;

public class change_518 {
    public int change(int amount, int[] coins) {
        int len = coins.length;
        int[]dp = new int[amount+1];
        for (int i = 0; i < amount + 1; i++) {
            if (i%coins[0]==0)
                dp[i] = 1;
            else
                dp[i] = 0;
        }
        for (int i = 1; i < len; i++) {
            for (int j = coins[i]; j < amount + 1; j++) {
                dp[j] = dp[j]+dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
    public int change2(int amount, int[] coins) {
        int len = coins.length;
        int[][] dp = new int[len][amount+1];
        for (int i = 0; i < amount + 1; i++) {
            if (i%coins[0]==0)
                dp[0][i] = 1;
            else
                dp[0][i] = 0;
        }
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (j-coins[i]>0)
                dp[i][j] = dp[i-1][j]+dp[i][j-coins[i]];
            }
        }
        return dp[len-1][amount];
    }
}
