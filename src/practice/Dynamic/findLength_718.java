package practice.Dynamic;

import java.util.Arrays;

public class findLength_718 {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length+1][B.length+1];
        Arrays.fill(dp[0],0);
        for (int i = 0; i < A.length; i++) {
            dp[i][0] = 0;
        }
        int res = 0;
        for (int i = 1; i < A.length+1; i++) {
            for (int j = 1; j <B.length+1 ; j++) {
                if (A[i-1]==B[j-1]){
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
