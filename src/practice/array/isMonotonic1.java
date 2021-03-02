package practice.array;

import java.util.Arrays;

/**
 * 896
 */
public class isMonotonic1 {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        boolean flag = true;
        if (len==1) return true;
        int a = 0;
        for (int i=0;i<len;i++){
            if ((A[i]-A[0])!=0){
                a = A[i]-A[0];
                break;
            }
        }
        for (int i=1;i<len-1;i++){
            if ((A[i+1]-A[i])*a<0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
