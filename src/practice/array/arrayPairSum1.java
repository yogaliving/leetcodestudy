package practice.array;

import java.util.Arrays;

/**
 * 561
 */
public class arrayPairSum1 {
    public static void main(String[] args) {
        int[] a = {1,4,3,2};
        arrayPairSum(a);
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i=0;i<nums.length;i+=2){
            sum = sum + nums[i];
        }
        return sum;
    }
}
