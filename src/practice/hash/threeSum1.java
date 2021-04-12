package practice.hash;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum1 {
/**
 *     三数之和，这里肯定不能用暴力破解法，因为暴力破解是3次方的循环
 *     所以想到排序后，用双指针的方法，再加上去重
 */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len =  nums.length;
        if (len<3||nums==null) return list;
        Arrays.sort(nums);//排序后方便去重
        for (int i = 0; i < len; i++) {
            if (nums[i]>0) break;
            if (i>0&&nums[i]==nums[i-1]) continue;
            int L=i+1;int R = len-1;
            while (L<R){
                int sum = nums[i]+nums[L]+nums[R];
                if (sum==0)
                {
                    while (L<R && nums[L] == nums[L + 1]) L++;//去重
                    while (L<R && nums[R] == nums[R - 1]) R--;
                    list.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    L++;
                    R--;
                }
                if (sum<0) L++;
                if (sum>0) R--;
            }
        }
        return list;
    }















    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();
        int len =  nums.length;
        if (len<3||nums==null) return list1;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i]>0) break;
            if(i>0&&nums[i]==nums[i-1]) continue;
            int L = i+1;
            int R = len-1;
            while (L<R){
                int sum = nums[i]+nums[L]+ nums[R];
                if (sum==0){
                    list1.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R&&nums[L]==nums[L+1])L++;
                    while (L<R&&nums[R]==nums[R-1])R--;
                    L++;
                    R--;
                }
                if (sum<0) L++;
                if (sum>0) R--;
            }
        }
        return list1;
    }
}
