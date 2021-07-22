package practice.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]>b[0] ? 1 :-1);
        int[][] res = new int[intervals.length][2];
        int index = -1;
        for (int i = 0; i < intervals.length; i++) {
            if (index==-1||intervals[i][0]>res[index][1]){
                res[++index][0] = intervals[i][0];
                res[index][1] = intervals[i][1];
            }else {
                res[index][1] = Math.max(intervals[i][1],res[index][1]);
            }
        }
        return Arrays.copyOf(res,index+1);
    }
}
