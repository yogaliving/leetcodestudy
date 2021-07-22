package practice.Backtracking;
/**
 * 全排列需要注意的点就是→需要有一个数组记录访问过的index
 */

import java.util.*;

public class permute_46 {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        Deque<Integer> path = new ArrayDeque<>();
        int[] visited = new int[nums.length];
        search_all(nums,path,visited);
        return result;
    }
    private void search_all(int[] nums, Deque<Integer> path,int[] visited){
        if (path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]==1) continue;
            visited[i] = 1;
            path.add(nums[i]);
            search_all(nums, path,visited);
            visited[i]=0;
            path.removeLast();
        }
    }
}
