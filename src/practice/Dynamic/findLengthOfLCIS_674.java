package practice.Dynamic;

import java.util.Arrays;

public class findLengthOfLCIS_674 {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(nums,1);
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[i-1]) {
                dp[i] = dp[i - 1] + 1;
                res = Math.max(dp[i],res);
            }
            else
                dp[i] = 0;
        }
        return res;
    }
}
