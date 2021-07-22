package practice.Dynamic;

import java.util.Arrays;

public class lengthOfLIS_300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len<2) return 0;
        int[] dp = new int[len+1];
        Arrays.fill(dp,1);
        int res = 0;
        for (int i = 1; i < len+1; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j]<nums[i])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
            res = Math.max(res,dp[i]);
        }
        return  res;
    }
}
