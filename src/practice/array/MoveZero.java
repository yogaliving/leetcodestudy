package practice.array;
/**
 * leetcode 283
 */

import java.util.ArrayList;

public class MoveZero {

    public static void main(String[] args) {
        int[] a1 = {0,1,0,3,12};
        moveZeroes(a1);

    }
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                arrayList.add(nums[i]);
            }
        }
        int a1 = arrayList.size();
        for (int j =0;j<nums.length-a1;j++){
            arrayList.add(0);
        }
        for(int i =0;i<nums.length;i++){
            nums[i] = arrayList.get(i);
        }
    }
}
