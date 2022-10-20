import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib_mem(n, new int[n+1]));
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib_mem(int n, int[] dp) {
        if(n == 0 || n == 1) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fib_mem(n - 1, dp) + fib_mem(n - 2, dp);
    }
}