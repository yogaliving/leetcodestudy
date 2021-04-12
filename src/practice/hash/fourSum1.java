package practice.hash;
/**
 * 14 四数之和  还是用到双指针  思想和三数之和差不多
 *   注意去重
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums); int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i>0&&nums[i]==nums[i-1]) continue;
            for (int j = i+1; j < len ; j++) {
                if (j>i+1&&nums[j]==nums[j-1]) continue;
                int sum = 0;
                int l =j+1;
                int r = len-1;
                while (l<r){
                    sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while (l<r&&nums[l]==nums[l+1]) l++;
                        while (l<r&&nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    }
                    if (sum<target) l++;
                    if (sum>target) r--;
                }
            }
        }
        return list;
    }
}
