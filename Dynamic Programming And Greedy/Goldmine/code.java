import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();
    int[][] arr = new int[N][M];
    for(int i=0;i<N;++i)
      for(int j=0;j<M;++j)
        arr[i][j] = scn.nextInt();

    int[][] dp = new int[N+1][M+1];
    int[][] dir = {{-1,1},{0,1},{1,1}};
    
    for(int sc=M-1;sc>=0;--sc) {
      for(int sr=N-1;sr>=0;--sr) {
        if(sc == M-1) { // last column remains same
          dp[sr][sc] = arr[sr][sc];
          continue;
        }
        
        int maxGold = 0;
        for(int d=0;d<dir.length;++d) { // for rest of the cells
          int r = sr + dir[d][0];
          int c = sc + dir[d][1];
          if(r>=0 && c>=0 && r<N && c<M)
            maxGold = Math.max(maxGold, dp[r][c] + arr[sr][sc]);
        }
        dp[sr][sc] = maxGold;
      }
    }

    int ans = 0;
    for(int r=0;r<N;++r) ans = Math.max(ans, dp[r][0]);
    System.out.println(ans);
  }

}