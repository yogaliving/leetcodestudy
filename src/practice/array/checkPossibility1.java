package practice.array;

import java.util.HashSet;

/**
 * 665
 */
public class checkPossibility1 {
    public static void main(String[] args) {
        int[] a = {4,2,3};
        checkPossibility(a);
    }
    public static boolean checkPossibility(int[] nums) {
        int len = nums.length;
        int a=-1; int counta=0;
        int b=-1; int countb=0;
        for (int i=0;i<len-1;i++){
            for (int j = i+1;j<len;j++){
                if((nums[j]-nums[i])<0){
                    if(counta>1&&countb>1) break;
                    if(a==-1||a!=i) {
                        a = i;
                        counta++;
                    }
                    if(b==-1||b!=j) {
                        b = j;
                        countb++;
                    }
                }
            }
        }
        if (counta>1&&countb>1) return false;
        return true;
    }
}
