package practice.array;

/**
 * 643
 */
public class findMaxAverage1 {
    public static void main(String[] args) {
        int[] a = {0,1,1,3,3};
        System.out.println(findMaxAverage(a, 4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;int max = 0;

        if(k>nums.length){
            for (int j=0;j<nums.length;j++){
                max = max+nums[j];
            }
            return max;
        }
        //   double res=max 把这里的max转换成double
        for (int j=0;j<k;j++){
            max = max+nums[j];
        }
        for (int i=0;i<len-k+1;i++){
            for (int j=0;j<k;j++){
                sum = sum+nums[i+j];
            }
            if (sum>=max) max = sum;
            sum = 0;
        }
        return (double) max/k;
    }
    //  可以优化 sum+=nums[i]-nums[i-k];
}
