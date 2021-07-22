package practice.Backtracking;

import java.util.*;

public class combinationSum31 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        Deque<Integer> path = new ArrayDeque<>();
        findPath(result,path,1,k,n);
        return result;
    }
    private void findPath(List<List<Integer>> result,Deque<Integer> path, int start,int k,int n){
        if (path.size()>=k){
            int sum = 0;
            List<Integer> list = new ArrayList<>(path);
            for (int i = 0; i < k; i++) {
                sum+=list.get(i);
            }
            if (sum==n)
                result.add(list);
            return;
        }
        for (int i = start; i <= 9-(path.size()-1)+1; i++) {
            path.add(start);
            findPath(result, path, start+1, k, n);
            path.removeLast();
        }
    }
}
