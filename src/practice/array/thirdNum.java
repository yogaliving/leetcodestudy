package practice.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 414 但是时间复杂度没有达到o(n)
 */
public class thirdNum {
    public static void main(String[] args) {
        int[] a1 = {1,1,2,1,3,2,3,4,5,3,-2,33,-33,-2};
        System.out.println(thirdMax(a1));

    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hashSet =new HashSet<Integer>();
        if (nums.length<=2) return nums[nums.length-1];
        for (int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        Integer[] num1 = new Integer[hashSet.size()];
        hashSet.toArray(num1);
        Arrays.sort(num1);
        if (num1.length<=2) return num1[num1.length-1];
        return num1[num1.length-3];
    }
}
