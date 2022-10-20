import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(climb(n, new int[n+1]));
    }

    public static int climb(int n, int[] dp) {
        if(n == 0) return 1;
        else if(n < 0) return 0;
        if(dp[n] != 0) return dp[n];
        return dp[n] = climb(n-1,dp) + climb(n-2,dp) + climb(n-3,dp);
    }

}