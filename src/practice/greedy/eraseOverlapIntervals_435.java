package practice.greedy;

import java.util.Arrays;

public class eraseOverlapIntervals_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]>b[1] ? 1 : -1);
        int len = intervals.length;
        int res = 0;
        for (int i = 0; i < len-1; i++) {
            if (intervals[i+1][0]<intervals[i][1]){
                res++;
                intervals[i+1][1]=intervals[i][1];
            }
        }
        return res;
    }
}
