package practice.Backtracking;
/**
 * 131
 * 切割的本质和组合是一样的，但是此题要注意切割时候的子串
 */

import java.util.*;

public class partition1 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        Deque<String> path = new ArrayDeque<>();
        search_par(result,path,0,s);
        return result;
    }

    private void search_par(List<List<String>> result,Deque<String> path,int start,String s){
        if (start==s.length()){
            result.add(new ArrayList<>(path));
        }
        for (int i = start; i < s.length(); i++) {
            if(isPalindrome(start,i,s)){
                path.add(s.substring(start,i+1));
            }else continue;
            search_par(result, path, i+1, s);
            path.removeLast();
        }
    }
    //判断是否是回文
    public boolean isPalindrome(int left, int right,String s ){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
