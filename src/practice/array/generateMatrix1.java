package practice.array;

import java.util.ArrayList;
import java.util.List;

public class generateMatrix1 {
    public int[][] generateMatrix(int n) {
        List<Integer> list =new ArrayList<>();
        int[][] arr = new int[n][n];
        if (n==0) return arr;
        int u =0; //上边界
        int d = n-1; //下边界
        int r = n-1; // 右边界
        int l = 0; //左边界
        int x=1;
        while (true){
            for (int i = l; i <=r  ; i++) {
                arr[u][i] = x;
                x++;
            }
            if (++u <= d) break;
            for (int i = u; i <= d ; i++) {
                arr[i][r] = x;
                x++;
            }
            if (--r < l) break;
            for (int i = r; i >=l ; i--) {
                arr[d][i] = x;
                x++;
            }
            if (--d < u) break;
            for (int i = d; i >=u ; i--) {
                arr[i][l] = x;
                x++;
            }
            if (++l>r) break;
        }
        return arr;
    }
}
