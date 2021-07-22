package practice.Dynamic;

public class findTargetSumWays_494 {
    public int findTargetSumWays(int[] nums, int target) {
        int t = nums.length;
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        if (sum<Math.abs(target)) return 0;
        int[][] dp = new int[t][2*sum+1];

        if (nums[0]==0)
            dp[0][sum] =2;
        else {
            dp[0][sum-nums[0]] ++;
            dp[0][sum+nums[0]] ++;
        }
        for (int i = 1; i < t; i++) {
            for (int j = -sum; j < sum+1; j++) {
                if (j+sum-nums[i]<0)
                    dp[i][j+sum] = dp[i-1][j+sum+nums[i]];
                else if (j+sum+nums[i]>2*sum)
                    dp[i][j+sum] = dp[i-1][j+sum-nums[i]];
                else
                    dp[i][j+sum] = dp[i-1][j+sum-nums[i]]+dp[i-1][j+sum+nums[i]];
            }
        }
        return dp[t-1][sum+target];
    }
}
