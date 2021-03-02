package practice.array;

/**
 *697
 */
public class findShortestSubArray1 {
    public static void main(String[] args) {
        int[] a1 = {1,2,2,3,1};
        findShortestSubArray(a1);
    }
    public static int findShortestSubArray(int[] nums) {
        int len = nums.length;
        if (len==0) return 0;
        int left ; int degree =1;
        int right = 0; int max = 0;
        int length = len; int lex = 0;
        int aa =0;
        for (int i=0;i<len-1;i++){
            left = i;
            if (aa==nums[i]) continue;
            for (int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    right = j;
                    degree++;
                    lex ++;
                }
            }
                if((length>right-left+1)&&degree==max) {
                    length = right - left + 1;
                }
                if(degree>max) {
                    length = right - left + 1;
                    max = degree;
                }
            degree=1;
            aa = nums[i];
        }
        if(lex ==0) length=1;
        return length;
    }
}
