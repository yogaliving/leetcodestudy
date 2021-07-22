package practice.Dynamic;

import java.util.HashMap;
import java.util.List;

public class wordBreak_139 {
    HashMap<String,Boolean> map = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp= new boolean[s.length()+1];
        for (String s1 : wordDict){
            map.put(s1,true);
        }
        dp[0] = true;
        for (int i = 1; i <= s.length() ; i++) {
            for (int j = i-1; j >=0 ; j--) {
                dp[i] = dp[j] && check(s.substring(j, i));
                if(dp[i])   break;
            }
        }
        return dp[s.length()];
    }
    private boolean check(String s){
        //如果有s则返回s的value，如果没有s则返回false
        return map.getOrDefault(s,false);
    }
}
