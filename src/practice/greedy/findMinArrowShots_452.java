package practice.greedy;

import java.util.Arrays;

public class findMinArrowShots_452 {
    public int findMinArrowShots(int[][] points) {
        int len = points.length;
        int res = 1;
        int[] temp = {0,0};
        Arrays.sort(points, (o1, o2) -> o1[0] > o2[0] ? 1 : -1);
        for (int i = 1; i < len; i++) {
            if (points[i][0]>points[i-1][1])
                res++;
            else {
                points[i][1] =Math.min(points[i-1][1],points[i][1]);
            }
        }
        return res;
    }
}
