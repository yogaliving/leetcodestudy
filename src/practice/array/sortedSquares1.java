package practice.array;

import java.util.Arrays;

/**
 * 977
 */
public class sortedSquares1 {
    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        for (int i=0;i<A.length;i++){
            B[i] = A[i]*A[i];
        }
        Arrays.sort(B);
        return B;
    }
    public int[] sortedSquares2(int[] A) {
        int len=A.length;
        int[] B = new int[len];
        int i=0;int j=0;int a=len-1;
        while ((i+j)<len){
            if(A[i]*A[i]>A[len-j-1]*A[len-j-1]){
                B[a] = A[i]*A[i];i++;a--;
            }else{
                B[a] = A[len-j-1]*A[len-j-1];;j++;a--;
            }
        }
        return B;
    }
}
