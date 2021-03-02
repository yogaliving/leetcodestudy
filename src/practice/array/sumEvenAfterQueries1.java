package practice.array;

/**
 *985
 */
public class sumEvenAfterQueries1 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int len = A.length;
        int count = 0; int a=0;int b=0;
        for (int j=0;j<len;j++){
            if (A[j]%2==0) count = count + A[j];
        }
        int[] B = new int[len];
        for (int i=0;i<len;i++){
            if (A[queries[i][1]]%2==0)count-=A[queries[i][1]];
            A[queries[i][1]] += queries[i][0];
            if (A[queries[i][1]]%2==0)count+=A[queries[i][1]];
            B[i] = count;
        }
        return B;
    }
}
