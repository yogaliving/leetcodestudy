package practice.array;

/**
 * 674 听说可以用动态规划？
 */
public class findLengthOfLCIS1 {
    public int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        if (len==0) return 0;
        int count = 1;
        int max = 1;
        for (int i=0;i<len-1;i++){
            if((nums[i+1]-nums[i])>0) {
                count++;
            }
            else count =1;
            if(max<count) max=count;
        }
        return max;
    }
}
