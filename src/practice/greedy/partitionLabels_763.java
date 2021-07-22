package practice.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class partitionLabels_763 {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))){
                map2.put(s.charAt(i),i);
                map1.put(s.charAt(i),i);
            }else {
                map2.put(s.charAt(i),i);
            }
        }
        int len = 0;
        for (Character a: map1.keySet()){
            len++;
        }
        int[][] arr = new int[len][2];
        int count=0;
        for (Character a: map2.keySet()){
            arr[count][0] =map1.get(a);
            arr[count][1] =map2.get(a);
            count++;
        }
        Arrays.sort(arr,(a,b)->a[0]>b[0] ? 1:-1);
        List<Integer> res = new ArrayList<>();
        int min = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i][1]<arr[i+1][0]){
                res.add(arr[i][1]-arr[i][0]+1);
            }else {
                arr[i+1][0] = Math.min(arr[i+1][0],arr[i][0]);
                arr[i+1][1] = Math.max(arr[i+1][1],arr[i][1]);
            }
        }
        res.add(arr[arr.length-1][1]-arr[arr.length-1][0]+1);
        return res;
    }
}
