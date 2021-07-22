package practice.annother;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minLength {
    public static void main(String[] args) {
        int[] arr = {4,3,2,3,5,2,1,3,2,5,2,3,1,4};
        List<Integer> wireLengths = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
             wireLengths.add(arr[i]);
        }
        System.out.println(intculculateLength(wireLengths));
    }
    public static int intculculateLength(List<Integer> wireLengths){
        int [] arr = new int[wireLengths.size()];
        int sum = 0;
        for (int i = 0; i < wireLengths.size(); i++) {
            arr[i] = wireLengths.get(i);
            sum+=wireLengths.get(i);
        }
        Arrays.sort(arr);
        if (sum%arr[arr.length-1]==0) return arr[arr.length-1];
        int minLength = arr[arr.length-1];
        boolean flag = true;
        while (flag){
            while (sum%minLength!=0){
                minLength +=1;
            }
            int a = minLength - arr[arr.length-1];
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]==arr[i+1]) continue;
                a-=arr[i];
                if (a==0) flag=false;
            }
        }
        return minLength;
    }
}
