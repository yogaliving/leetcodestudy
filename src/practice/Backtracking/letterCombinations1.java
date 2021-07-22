package practice.Backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * 17
 * 怎么分别从多个数组取组合，多个组合的时候把第i此组合的情况也传递进去即可
 */
public class letterCombinations1 {
    public List<String> letterCombinations(String digits) {
        String[] arr = {" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new LinkedList<>();
        if (digits.length()==0) return result;
        StringBuilder sb = new StringBuilder();
        search_phone_number(arr,result,0,digits,sb);
        return result;
    }
    private void search_phone_number(String[] arr,List<String> result,int index,String digits,StringBuilder sb){
        //此方法中的index代表的在digits中的位置以及此时字符串的长度
        if (index==digits.length()){
            result.add(sb.toString());
            return;
        }
        //digits.charAt(index)-'0' 找到digits中对应在数组中索引的位置
        for (int i = 0; i < arr[digits.charAt(index)-'0'].length(); i++) {
            sb.append(arr[digits.charAt(index)-'0'].charAt(i));
            search_phone_number(arr, result, index+1, digits, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
