package practice.week_competition;

import java.util.HashSet;

public class diff_string {
    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence(""));
    }
    public static int countPalindromicSubsequence(String s) {
        int len =s.length();
        int[] dp = new int[len];
        HashSet <String> set = new HashSet<>();
        for (int i = 2; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i)==s.charAt(j)){
                    if (i>3&&s.charAt(i)==s.charAt(i-1)&&s.contains(s.charAt(j)+s.charAt(i-1)+s.charAt(i)+"")) break;
                    for (int k = j+1; k < i; k++) {
                        String str = ""+s.charAt(j)+s.charAt(k)+s.charAt(i);
                        set.add(str);
                    }
                }
            }
        }
        return set.size();
    }//"tlpjzdmtwderpkpmgoyrcxttiheassztncqvnfjeyxxp"
}
