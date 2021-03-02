package practice.array;

import java.util.Arrays;

/**
 * 747
 */
public class dominantIndex1 {
    public int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len==1) return 0;
        int b =0;
        int a = -1;
        int[] nums1 = new int[len];
        for (int i = 0; i < len; i++) {
            nums1[i] = nums[i];
        }
        Arrays.sort(nums);
        if (nums[len-2]==0) b =2;
        else
        b = nums[len - 1] / nums[len - 2];
            if (b < 2) return a;
        for (int i = 0; i < len; i++) {
            if(nums1[i]==nums[len-1]) a = i;
        }
        return a;
    }
}
