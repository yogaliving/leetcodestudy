package practice.hash;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 1
 * 本题可用暴力破解法但是时间复杂度较高
 * 还可用hash集合来进行检测
 */
public class twoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                arr[0] = (int)map.get(target-nums[i]);
                arr[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
