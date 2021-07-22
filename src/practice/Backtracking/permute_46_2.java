package practice.Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class permute_46_2 {
    List<List<Integer>> result = new LinkedList<>();
    ArrayList<Integer> path = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] vis = new int[nums.length];
        search(nums, vis);
        return result;
    }

    private void search(int[] nums, int[] vis) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            path.add(nums[i]);
            vis[i] = 1;
            if (vis[i] == 1||i>1&&vis[i]==vis[i-1]&&vis[i-1]!=0) continue;
            search(nums, vis);
            vis[i] = 0;
            path.remove(path.size() - 1);
        }
    }
}
