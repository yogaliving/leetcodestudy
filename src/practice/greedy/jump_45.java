package practice.greedy;

public class jump_45 {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int curDistance = 0;    // 当前覆盖最远距离下标
        int ans = 0;            // 记录走的最大步数
        int nextDistance = 0;   // 下一步覆盖最远距离下标
        for (int i = 0; i < nums.length; i++) {
            nextDistance = Math.max(nextDistance,i+nums[i]);
            if (i==curDistance){
                    curDistance = nextDistance;
                    ans++;
            }
        }
        return ans;
    }
}
