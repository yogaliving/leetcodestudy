package practice.array;

import java.util.ArrayList;

/**
 * 268
 */
public class LostNum {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        if (len==0) return -1;
        int [] array = sortArray(nums);
        int a =0;
        if (nums[0]!=0) return 0;
        if (nums[len-1]!=len) return len;
        for (int i =0;i<len-1;i++){
            if ((array[i+1]-array[i])>1)
                a = (array[i+1]+array[i])/2;
        }
        return a;
    }


    public int[] sortArray(int [] nums){
        for (int i =1;i<nums.length;i++){
            int value = nums[i];
            int j = i-1;
            for (;j>=0;j--){
                if(nums[j]>value)
                    nums[j+1]=nums[j];
                else
                    break;
            }
            nums[j+1] = value;
        }
        return nums;
    }
}
