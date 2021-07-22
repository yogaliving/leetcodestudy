package practice.Backtracking;

import java.util.*;

/**
 * 90
 */
public class findSubsequences1 {
    HashSet<ArrayList<Integer>> set = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Deque<Integer> path = new ArrayDeque<>();
        search_array(path, nums, 0);
        for (ArrayList<Integer> arrayList : set){
            result.add(arrayList);
        }
        return result;
    }
    private void search_array(Deque<Integer> path,int[] nums,int start){
        if (path.size()>=2&&isUp(new ArrayList<>(path))){
            set.add(new ArrayList<>(path));
        }
        for (int i = start; i < nums.length; i++) {
            if (i>start&&nums[i]==nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            search_array(path, nums, i+1);
            path.removeLast();
        }
    }
    private boolean isUp(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i+1)-arrayList.get(i)<0)
                return false;
        }
        return true;
    }
}
