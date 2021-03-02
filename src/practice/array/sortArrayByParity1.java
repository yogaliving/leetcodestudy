package practice.array;

/**
 * 905
 */
public class sortArrayByParity1 {
    public int[] sortArrayByParity(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        int countO = 0;int countJ = 0;
        for (int i=0;i<len;i++){
            if(A[i]%2==0) {
                B[countO] = A[i];
                countO++;
            }
            else {
                B[len-1-countJ] = A[i];
                countJ++;
            }
        }
        return B;
    }
}
