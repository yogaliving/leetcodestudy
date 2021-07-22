package practice.Backtracking;
/**
 * 40
 */

import java.util.*;

public class combinationSum21 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(candidates);
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
        for (int i = start; i < candidates.length; i++) {
            //保证本层的选择的元素不重复，但是这样写需要先把数组进行排序
            if (i>start&&candidates[i]==candidates[i-1]) continue;
            sum+=candidates[i];
            path.add(candidates[i]);
            search_sum(result, candidates, path, target, sum,i+1);
            sum-=path.removeLast();
        }
    }
}
