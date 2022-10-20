import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(climb(n, new int[n+1])); // Memoization
        System.out.println(climbTab(n)); // Tabulation
    }

    public static int climb(int n, int[] dp) {
        if(n == 0) return 1;
        else if(n < 0) return 0;
        if(dp[n] != 0) return dp[n];
        return dp[n] = climb(n-1,dp) + climb(n-2,dp) + climb(n-3,dp);
    }

    public static int climbTab(int n) {
        int []dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= n; ++i) {
            if(i-1 >= 0) dp[i] += dp[i-1];
            if(i-2 >= 0) dp[i] += dp[i-2];
            if(i-3 >= 0) dp[i] += dp[i-3];
        }
        return dp[n];
    }

}