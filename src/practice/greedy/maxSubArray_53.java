package practice.greedy;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count>sum) sum = count;
            if (count<=0) count = 0;
        }
        return sum;
    }
}
