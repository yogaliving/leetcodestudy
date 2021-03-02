package practice.array;

import java.util.Arrays;

/**
 * 628
 * 可以不用排序，找到最小的两个和最大的三个数即可
 */
public class maximumProduct1 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int len = nums.length;
        if (len==1) return nums[0];
        if(len==2) return nums[0]*nums[1];
        max = nums[len-1]*nums[len-2]*nums[len-3];
        if (nums[0]<0) {
            if (nums[len - 1] * nums[len - 2] * nums[len - 3] < nums[0] * nums[1] * nums[len - 1])
                max = nums[0] * nums[1] * nums[len - 1];
        }

        return max;
    }
}
