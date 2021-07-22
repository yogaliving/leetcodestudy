package practice.String1;

import java.util.Arrays;

public class longestPalindrome_5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len<2) return s;
        int maxLen = 1;
        int begin = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                if (isPalindrome(chars,i,j)&j-i+1>maxLen) {
                    maxLen = j - i + 1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
    private boolean isPalindrome(char[] chars,int left , int right){
        while (left<right){
            if (chars[left]!=chars[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}
