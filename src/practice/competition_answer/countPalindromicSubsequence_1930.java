package practice.competition_answer;
//商汤科技周赛第二题

import java.util.HashSet;

public class countPalindromicSubsequence_1930 {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int res = 0;
        //枚举两侧的字符
        for (char ch = 'a'; ch <'z' ; ++ch) {
            int l = 0; int r = s.length()-1;
            //寻找字符第一次出现的下标
            while (l<n && s.charAt(l)!=ch){
                ++l;
            }
            while (r>=0 && s.charAt(r)!=ch){
                --r;
            }
            if (r-l<2) continue;

            HashSet set = new HashSet();
            for (int i = l+1; i < r; i++) {
                set.add(s.charAt(i));
            }
            res += set.size();
        }
        return res;
    }
}
