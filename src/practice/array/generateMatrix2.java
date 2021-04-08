package practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generateMatrix2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<>();
        if (matrix.length==0) return list;
        int u =0; //上边界
        int d = matrix.length-1; //下边界
        int r = matrix[0].length-1; // 右边界
        int l = 0; //左边界
        while (true){
            for (int i = l; i <= r; i++) {
                list.add(matrix[u][i]);
            }
            if (++u>d) break;
            for (int i = u; i <= d ; i++) {
                list.add(matrix[i][r]);
            }
            if (--r < l) break;
            for (int i = r; i >=l ; i--) {
                list.add(matrix[d][i]);
            }
            if (--d < u) break;
            for (int i = d; i >=u ; i--) {
                list.add(matrix[l][i]);

            }
            if (++l>r) break;
        }
        return  list;
    }
}
