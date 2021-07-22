package practice.greedy;

import java.util.LinkedList;

public class reconstructQueue_406 {
    public int[][] reconstructQueue(int[][] people) {
        int len = people.length;
        int[] temp = {0,0};
        LinkedList<int []> list = new LinkedList<>();
        int [][] res = new int[len][2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <len -1-i; j++) {
                if (people[j][0]<people[j+1][0]){
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }else if (people[j][0]==people[j+1][0]){
                    if (people[j][1]>people[j+1][1]){
                        temp = people[j];
                        people[j] = people[j+1];
                        people[j+1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < len; i++) {
            list.add(people[i][1],people[i]);
        }
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
