package practice.array;

import java.util.Arrays;
import java.util.HashSet;
//leetcode217
public class SameElement1 {

    //利用hashset去重
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i =0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        if (hashSet.size()!=nums.length)
            return true;
        else
            return false;
    }

    //先排序
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;

    }

}
