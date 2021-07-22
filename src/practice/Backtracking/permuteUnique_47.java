package practice.Backtracking;

import java.util.*;

/**
 * 注意去重的思想！nums[i] == nums[i - 1] && 1!=visited[i - 1]（表示已经访问过了一样的值，所以直接跳过）
 */
public class permuteUnique_47 {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        Deque<Integer> path = new ArrayDeque<>();
        int[] visited = new int[nums.length];
        Arrays.sort(nums);
        search_all1(nums,path,visited);
        return result;
    }
    private void search_all1(int[] nums, Deque<Integer> path,int[] visited){
        if (path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]==1||(i > 0 && nums[i] == nums[i - 1] && 1!=visited[i - 1])) continue;
            visited[i] = 1;
            path.add(nums[i]);
            search_all1(nums, path,visited);
            visited[i]=0;
            path.removeLast();
        }
    }
}
