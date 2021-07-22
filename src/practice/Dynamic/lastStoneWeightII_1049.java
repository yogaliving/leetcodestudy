package practice.Dynamic;

public class lastStoneWeightII_1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        int len = stones.length;
        for (int i = 0; i < len; i++) {
            sum += stones[i];
        }
        int target = sum/2;
        int[] dp = new int[target+1];
        dp[0] = 0;
        for (int i = 0; i < len; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-dp[target]*2;
    }
}
