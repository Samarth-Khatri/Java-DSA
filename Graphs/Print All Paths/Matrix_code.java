import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      Integer[][] graph = new Integer[vtces][vtces];

      int edges = Integer.parseInt(br.readLine());
      for(int i = 0; i < edges; i++){
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1][v2] = wt;
         graph[v2][v1] = wt;
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      boolean []visited = new boolean[vtces]; 
      printAllPaths(graph, visited, src, dest, src + "");
   }

   public static void printAllPaths(Integer[][] graph, boolean []visited, int src, int dest, String path) {
      if(src == dest) { 
         System.out.println(path);
         return;
      }
      visited[src] = true;
      for(int nbr=0;nbr<graph.length;++nbr) {
         if(graph[src][nbr] != null && !visited[nbr])
            printAllPaths(graph, visited, nbr, dest, path + nbr);
      }
      visited[src] = false;
   }
}