package practice.String1;

public class longestPalindrome_5_2 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<2) return s;
        int maxLen= 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        char[] chars = s.toCharArray();

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (chars[i]!=chars[j])
                    dp[j][i] =false;
                else{
                    if (i-j<3)  dp[j][i]=true;
                    else
                        dp[j][i] = dp[j+1][i-1];
                }
                if (i-j+1>maxLen&&dp[j][i]){
                    maxLen = i-j+1;
                    begin = j;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

}
