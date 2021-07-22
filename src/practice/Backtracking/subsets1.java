package practice.Backtracking;
/**
 * 78
 */

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class subsets1 {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length==0) return null;
        List<List<Integer>> result = new LinkedList<>();
        Deque<Integer> path = new LinkedList<>();
        int len = nums.length;
        dfs(nums,0,result,path);
        return result;
    }
    private void dfs(int[] nums ,int start,List<List<Integer>> result,Deque<Integer> path){
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums,i+1,result,path);
            path.removeLast();
        }
    }
}
