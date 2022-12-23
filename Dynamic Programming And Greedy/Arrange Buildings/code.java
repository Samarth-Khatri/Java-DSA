import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    long[][] dp = new long[2][n + 1];
    dp[0][1] = 1;
    dp[1][1] = 1;
    for (int i = 2; i <= n; ++i) {
      dp[0][i] = dp[1][i - 1];
      dp[1][i] = dp[0][i - 1] + dp[1][i - 1];
    }
    long ans = dp[0][n] + dp[1][n]; // config for one side of road
    System.out.println(ans*ans); // for buildings on both sides of roads
 }

}