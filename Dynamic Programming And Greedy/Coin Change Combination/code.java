import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = scn.nextInt();
        int k = scn.nextInt();
        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int j=0;j<arr.length;++j) { // coins
            for(int i=1;i<=k;++i) { // target
                if(i-arr[j] < 0) continue;
                dp[i] += dp[i-arr[j]]; 
            }
        }
        System.out.println(dp[k]);
    }
}