package practice.greedy;

import java.util.Arrays;

public class findContentChildren_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = s.length-1;
        int count = 0;
        for (int i = g.length-1; i >=0 ; i--) {
            if (j<=0) break;
            if (s[j]>g[i]){
                count++;
                j--;
            }
        }
        return count;
    }
}
