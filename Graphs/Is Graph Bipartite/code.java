import java.io.*;
import java.util.*;

public class Main {
   static class Pair {
      int vtx;
      int lvl;

      Pair(int vtx, int lvl) {
         this.vtx = vtx;
         this.lvl = lvl;
      }
   }
   
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      Integer[] visited = new Integer[vtces];
      for(int i=0;i<graph.length;++i) 
         if(visited[i] == null) 
            if(!isCompBipartite(graph,visited,i)) {
               System.out.println(false);
               return;
            }
      System.out.println(true);
   }

   public static boolean isCompBipartite(ArrayList<Edge>[] graph, Integer[] visited, int src) {
      Queue<Pair> que = new ArrayDeque<>();
      que.add(new Pair(src, 0));
      while(!que.isEmpty()) {
         Pair rem = que.remove();
         if(visited[rem.vtx] != null) 
            if(visited[rem.vtx] != rem.lvl % 2)
               return false;
         visited[rem.vtx] = rem.lvl % 2; // 0 for even, 1 for odd and null if not visited
         for(Edge e : graph[rem.vtx]) 
            if(visited[e.nbr] == null)
               que.add(new Pair(e.nbr, rem.lvl + 1));
      }
      return true;
   }
}