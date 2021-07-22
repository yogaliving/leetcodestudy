package practice.greedy;

public class candy_135 {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] fill = new int[len];
        int[] fill1 = new int[len];
        for (int i = 0; i < len; i++) {
            fill[i] = 1;
            fill[i] = 1;
        }
        for (int i = 1; i < len; i++) {
            if (ratings[i]>ratings[i-1]) fill[i]+=fill[i]+1;
        }
        for (int i = len-2; i >=0 ; i--) {
            if (ratings[i]<=ratings[i+1]) fill[i]+=fill[i]+1;
        }
        for (int i = 0; i < len; i++) {
            fill[i] = Math.max(fill[i],fill1[i]);
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum+=fill[i];
        }
        return sum;
    }
}
