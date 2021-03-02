package practice.array;

/**
 * 867 注意初始化长和宽的值都需要给，不然回报空指针异常
 */
public class transpose1 {
    public int[][] transpose(int[][] A) {
        int len = A.length;
        int len1 = A[0].length;
        int[][] B = new int[len1][len];
        for (int i=0;i<len;i++){
            for (int j=0;j<len1;j++){
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
