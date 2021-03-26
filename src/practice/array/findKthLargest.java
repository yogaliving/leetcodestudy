package practice.array;

import java.util.Arrays;
import java.util.HashMap;

public class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length];
    }
}
