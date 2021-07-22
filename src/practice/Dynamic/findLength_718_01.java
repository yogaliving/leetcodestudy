package practice.Dynamic;

import java.util.Arrays;

public class findLength_718_01 {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length+1][B.length+1];
        int res = 0;
        for (int i = 1; i < A.length+1; i++) {
            for (int j = 1; j < B.length+1; j++) {
                if (A[i-1]==B[i-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else {
                    dp[i][j] = 0;
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
