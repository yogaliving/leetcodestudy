package practice.Backtracking;
/**
 * 39
 */

import java.util.*;

public class combinationSum1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        Deque<Integer> path = new ArrayDeque<>();
        search_sum(result,candidates,path,target,0,0);
        return result;
    }
    private void search_sum(List<List<Integer>> result,int[] candidates,Deque<Integer> path,int target,int sum,int start){
        if (sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        if (sum>target){
            return;
        }
        //注意这里的start是因为可以重复选取但是不能重复组合
        for (int i = start; i < candidates.length; i++) {
            sum+=candidates[i];
            path.add(candidates[i]);
            search_sum(result, candidates, path, target, sum,i);
            sum-=path.removeLast();
        }
    }
}
