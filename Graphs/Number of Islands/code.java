import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      boolean [][]visited = new boolean[m][n];

      int cnt = 0;
      for(int i=0;i<arr.length;++i) {
         for(int j=0;j<arr[0].length;++j) { 
            if(!visited[i][j] && arr[i][j] == 0) {
               cnt++;
               fillComp(arr,visited,i,j);
            }
         }
      }

      System.out.println(cnt);
   }

   public static void fillComp(int [][]graph, boolean [][]visited, int i, int j) {
      if(i<0 || j<0 || i>=graph.length || j>=graph[0].length || visited[i][j] || graph[i][j]==1)
         return;

      visited[i][j] = true;
      fillComp(graph,visited,i+1,j);
      fillComp(graph,visited,i-1,j);
      fillComp(graph,visited,i,j+1);
      fillComp(graph,visited,i,j-1);
   }

}