package practice.hash;
/**
 * 242 :q:::
 */

import java.util.Arrays;
import java.util.HashMap;

public class isAnagram1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] arr = new int[26];
        for(int i = 0; i< s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++; //这里的s.charAt(i) - 'a'是减去ASCll码表里面的数值 a的ascll码是97
            arr[t.charAt(i) - 'a'] --;
        }
        for(int i=0;i<26;i++)
            if(arr[i] != 0)
                return false;
        return true;
    }
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

}
