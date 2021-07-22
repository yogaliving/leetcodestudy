package practice.Dynamic;

public class combinationSum4_377 {
    public int combinationSum4(int[] nums, int target) {
        int [][] dp = new int[target+1][nums.length];
        for (int i = 0; i <= target; i++) {
            if (i%nums[0]==0)
            dp[i][0] = 1;
        }
        for (int i = 0; i <=target; i++) {
            for (int j = 1; j <nums.length ; j++) {
                dp[i][j] = dp[i-1][j];
                if (i-nums[j]>=0)
                dp[i][j] = dp[i][j-1]+dp[i-nums[j]][j];
            }
        }
        return dp[target][nums.length-1];
    }

}
