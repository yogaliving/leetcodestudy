package practice.array;


public class minSubArrayLen1 {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;int sum = 0;int len =10000;
        if (nums[0]==target) return 1;
        for (int j = 0; j < nums.length; j++) {
            sum+=nums[j];
            while (sum>=target){
                len = len>j-i+1 ? j-i+1 : len;
                sum-=nums[i++];
            }
        }
        return len==10000 ? 0 : len;
    }
}
