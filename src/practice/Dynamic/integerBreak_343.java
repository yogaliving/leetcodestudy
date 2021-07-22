package practice.Dynamic;

/**
 * 本题注意Math.max(j*(i-j),j*dp[i-j])，并且要保存每一次的dp[i]，与下一次的进行比较
 */
public class integerBreak_343 {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;dp[2] = 2;
        for (int i = 3; i < n; i++) {
            for (int j = 1; j < i-1; j++) {
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
