package practice.Dynamic;

public class numSquares_279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            dp[i] = i*i;
        }
        for (int i = 1; i*i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (j-i*i>=0)
                dp[j] = Math.min(dp[j],dp[j-i*i]+1);
            }
        }
        return dp[n];
    }
}
