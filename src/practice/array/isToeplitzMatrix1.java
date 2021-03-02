package practice.array;

/**
 * 766   //只用比较相临行
 */
public class isToeplitzMatrix1 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int len1 =matrix.length;
        boolean flag =true;
        for (int i=0;i<len1-1;i++){
            for (int j=0;j<matrix[i].length-1 ;j++){
                if (matrix[i][j]!=matrix[i+1][j+1]) flag=false;
            }
        }
        return flag;
    }
}
