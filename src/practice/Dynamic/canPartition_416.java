package practice.Dynamic;

public class canPartition_416 {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum +=nums[i];
        }
        if (sum%2 ==1 ) return false;
        int target = sum%2;
        // 创建二维状态数组，行：物品索引，列：容量（包括 0）
        boolean[][] dp = new boolean[len][target + 1];
        if (nums[0]<=target) dp[0][nums[0]] = true;

        for (int i = 1; i < len; i++) {
            for (int j = 0; j < target + 1; j++) {
                dp[i][j] = dp[i-1][j];
                if (nums[i]==j) {
                    dp[i][j] = true;
                    continue;
                }
                if (nums[i]<j){
                    dp[i][j] = dp[i-1][j]||dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[len-1][target];
    }
}
