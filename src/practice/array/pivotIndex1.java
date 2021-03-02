package practice.array;

/**
 * 724
 */
public class pivotIndex1 {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int x1 = -1;
        int sumL; int sumR;
        for (int x=0;x<len;x++){
            sumL=0;sumR=0;
            for (int i=0;i<x;i++){
                sumL = sumL+nums[i];
            }
            for (int j=x+1;j<len;j++){
                sumR = sumR+nums[j];
            }
            if(sumL==sumR){
                x1=x;
                break;
            }
        }
        return x1;
    }
    public int pivotIndex2(int[] nums) {
        int len = nums.length;
        int x1 = -1;
        int sumL=0;int sum=0;
        for (int x=0;x<len;x++){
            sum+=nums[x];
        }
        for (int i=0;i<len;i++){
            if(i>0);
            sumL = sumL+nums[i-1];
            if(sumL==sum-sumL-nums[i]){
                x1=i;
                break;
            }
        }
        return x1;
    }
}
