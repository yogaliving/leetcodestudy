package practice.hash;

import java.util.HashMap;

/**
 * 四数相加：分为两组，用hashmap记录前一组的所有组合的值出现的次数
 * 如果第二组的组合的负数和第一组的key相同，count加上hashmap的val
 */
public class fourSumCount1 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int sumAB = 0; int sumCD=0;int len = A.length;
        int count = 0;
        HashMap<Integer,Integer> hash = new HashMap();
        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len; j++) {
                sumAB = A[i]+B[j];
                if (hash.containsKey(sumAB)) hash.put(sumAB,hash.get(sumAB)+1);
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                sumCD = C[i]+D[j];
                if (hash.containsKey(-sumCD)) count+=hash.get(-sumCD);
            }
        }
        return count;
    }
}
