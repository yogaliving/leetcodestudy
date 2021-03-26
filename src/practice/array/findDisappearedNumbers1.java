package practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class findDisappearedNumbers1 {
    List<Integer> list = new LinkedList<>();
    public List<Integer> findDisappearedNumbers(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[nums[i]] = -Math.abs(nums[nums[i]]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) list.add(nums[i]);
        }
        return list;
    }
}
