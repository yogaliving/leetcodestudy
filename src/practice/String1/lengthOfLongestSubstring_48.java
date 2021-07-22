package practice.String1;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring_48 {
    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }
    public static   int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while(set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
