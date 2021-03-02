package practice.array;

/**
 * 485
 */
public class findMaxConsecutiveOne {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length<=0||nums.length>10000) return 0;
        int max = 0;
        int qq = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1) qq++;
            else qq=0;
            if(qq>max) max=qq;
        }
        return max;
    }

}
