package practice.array;

import java.util.Arrays;

public class flipAndInvertImage1 {
    public static int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        for (int i=0;i<len;i++){
                reserve(A[i]);
        }
        return A;
    }
    public static void reserve( int[] arr ){
        int[] arr1 = new int[arr.length];
        for( int x=0;x<arr.length;x++ ){
            arr1[x] = arr[arr.length-x-1];
        }
        for (int i=0;i<arr.length;i++){
            arr[i] = arr1[i];
        }
        reserve1(arr);
    }
    public static void reserve1( int[] arr ){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0) arr[i] =1;
            else arr[i] =0;
        }
    }
}
