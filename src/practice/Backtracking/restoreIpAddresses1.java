package practice.Backtracking;
/**
 * 93 注意这里的start==s.length()以及str.length()>3||(str.charAt(0)=='0'&&str.length()>1)||Integer.valueOf(str)>255
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class restoreIpAddresses1 {
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        if(n < 4 || n > 12) {
            return null;
        }
        List<String> result = new LinkedList<>();
        search_ip(result,new ArrayList<>(),s,0);
        return result;
    }
    private void search_ip(List<String> result,List<String> sb,String s,int start){
        if (sb.size()==4){
            if (start==s.length())
            result.add(String.join(".",sb));
            return;
        }
            for (int i = start; i < s.length(); i++) {
            String str = s.substring(start,i+1);
            if (str.length()>3||(str.charAt(0)=='0'&&str.length()>1)||Integer.valueOf(str)>255) continue;
            sb.add(str);
            search_ip(result, sb, s, i+1);
            sb.remove(sb.size()-1);
        }
    }

}
