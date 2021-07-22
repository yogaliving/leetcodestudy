package practice.Backtracking;

import java.util.*;

/**
 * 77
 */
public class combine1 {
    public List<List<Integer>> combine(int n, int k) {
        if (k==0||k>n) return null;
        List<List<Integer>> list = new LinkedList<>();//储存所有的结果集
        Deque<Integer> path = new ArrayDeque<>();//储存每一组结果集
        backTacking(n,k,1,path,list);
        return list;
    }
    private void backTacking(int n,int k,int start,Deque<Integer> path,List<List<Integer>> list){
        if (path.size()==k){
            list.add(new LinkedList<>(path));
            return;
        }
        for (int i = start; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backTacking(n,k,i+1,path,list);
            path.remove(path.removeLast());
        }
    }
}
