package practice.greedy;

import java.util.Arrays;

public class largestSumAfterKNegations_1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        int len = A.length;
        Arrays.sort(A);
        for (int i = 0; i < len; i++) {
            if (A[i]<0&&K>=0) {
                A[i] = -A[i];
                K--;
            }
        }
        Arrays.sort(A);
        int sum = 0;
        for (int i = 1; i < len; i++) {
            sum+=A[i];
        }

        return sum + (int)Math.pow(-1,K)*A[0];
    }
}
