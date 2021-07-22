package practice.Backtracking;

import java.util.*;

public class subsetsWithDup1 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(result,path,nums,0);
        return result;
    }
    private void dfs(List<List<Integer>> result,Deque<Integer> path,int[] nums,int start){
        if (start<=nums.length-1){
            result.add(new ArrayList<>(path));
        }
        for (int i = start; i < nums.length; i++) {
            if (i>start&&nums[i]==nums[i-1]) continue;
            path.add(nums[i]);
            dfs(result, path, nums, i+1);
            path.removeLast();
        }
    }
}
