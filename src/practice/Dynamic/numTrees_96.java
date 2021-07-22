package practice.Dynamic;

public class numTrees_96 {
    public int numTrees(int n) {
        int[] dp = new int[n];
        dp[0] = 1;dp[1] = 2;
        for (int i = 2; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i]+= dp[j]*dp[i-j];
            }
        }
        return dp[n-1];
    }
}
