package practice.Dynamic;

public class fib_509 {
    public static void main(String[] args) {
        fib(3);
    }
    public static int fib(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i <=n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            System.out.println(dp[i]);
        }
        return dp[n];
    }
}
