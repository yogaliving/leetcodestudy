package practice.greedy;

/**
 * 注意覆盖的面积
 */
public class canJump_55 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len<=1) return true;
        int cover = nums[0];
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover,i+nums[i]);
            if (cover >= len-1)
                return true;
        }
        return false;
    }
}
