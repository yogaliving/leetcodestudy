package practice.array;

import java.util.ArrayList;
import java.util.List;

public class largeGroupPositions1 {
    public static void main(String[] args) {
        String a = "abbxxxxzzy";
        System.out.println(largeGroupPositions(a));
    }
    public static List<List<Integer>> largeGroupPositions(String s) {
        s = s+'S';
        List<List<Integer>> lists = new ArrayList<>();
        int i=0;int count =0;List<Integer> temp = new ArrayList<>();
        while (i<s.length()-1){
            if (count>=2&&s.charAt(i)!=s.charAt(i+1)){
                temp.add(i-count);
                temp.add(i);
                lists.add(temp);
                temp=new ArrayList<>();
            }
            if(s.charAt(i)==s.charAt(i+1)) count++;
            else  count = 0;
            i++;
        }
        return lists;
    }
}
