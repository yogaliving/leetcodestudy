package practice.Dynamic;

public class rob_213 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length-1];
        int[] dp1 = new int[nums.length-1];
        if (nums.length<=1) return nums[0];
        if (nums.length<=2) return Math.max(nums[0],nums[1]);
        dp[0]=nums[0];dp[1] = Math.max(nums[0],nums[1]);
        dp1[0] = nums[1];dp1[1] = Math.max(nums[2],nums[1]);
        for (int i = 2; i < nums.length-1; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        for (int i = 2; i < nums.length-1; i++) {
            dp1[i] = Math.max(dp1[i-1],dp1[i-2]+nums[i+1]);
        }
        return Math.max(dp[nums.length-2],dp1[nums.length-2]);
    }
}
