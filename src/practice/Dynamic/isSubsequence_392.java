package practice.Dynamic;

public class isSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int i = 1; i < s.length()+1; i++) {
            for (int j = 1; j < t.length()+1; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                if (s.charAt(i-1)==s.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] +1;
            }
        }
        return dp[s.length()][t.length()] == s.length() ? true : false;
    }
}
