package practice.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 888
 */
public class fairCandySwap1 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        int a ;
        int[] C = new int[2];
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sumB += B[i];
        }
        a = (sumB - sumA) / 2;
        for (int x : B) setB.add(x);
        for (int x : A) {
            if (setB.contains(x + a)) {
                C[0] = x;
                C[1] = x + a;
            }
        }
        return C;
    }
}
