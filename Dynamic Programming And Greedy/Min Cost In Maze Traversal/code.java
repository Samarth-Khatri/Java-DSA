import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] cost = new int[n][m];
        for(int i=0;i<n;++i)
            for(int j=0;j<m;++j)
                cost[i][j] = scn.nextInt();
        int[][] dp = new int[n][m];
        for(int i=dp.length-1;i>=0;--i) {
            for(int j=dp[0].length-1;j>=0;--j) {
                if(i == dp.length-1 && j == dp[0].length-1) dp[i][j] = cost[i][j]; // last box
                else if(i == dp.length-1) dp[i][j] = cost[i][j] + dp[i][j+1]; // last row 
                else if(j == dp[0].length-1) dp[i][j] = cost[i][j] + dp[i+1][j]; // last column
                else dp[i][j] =  cost[i][j] + Math.min(dp[i+1][j], dp[i][j+1]); // elsewhere
            }
        }
        System.out.println(dp[0][0]);
    }

}