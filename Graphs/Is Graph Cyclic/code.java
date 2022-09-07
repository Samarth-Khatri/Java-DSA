import java.io.*;
import java.util.*;

public class Main {
   static class Pair {
      int vtx;
      String psf;

      Pair(int vtx, String psf) {
         this.vtx = vtx;
         this.psf = psf;
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

      boolean []visited = new boolean[vtces];
      for(int i=0;i<graph.length;++i) {
         if(!visited[i])
            if(isCyclic(graph,visited,i)) {
               System.out.println(true);
               return;
            }
      }

      System.out.println(false);
   }

   public static boolean isCyclic(ArrayList<Edge> []graph, boolean []visited, int src) {
      Queue<Pair> que = new ArrayDeque<>();
      que.add(new Pair(src,src+""));

      while(!que.isEmpty()) {
         // remove -> mark* -> work(display) -> add*
         
         // Remove
         Pair rem = que.remove();

         // Mark*
         if(visited[rem.vtx]) 
            return true;
         visited[rem.vtx] = true;

         // Add*
         for(Edge e : graph[rem.vtx])
            if(!visited[e.nbr])
               que.add(new Pair(e.nbr, rem.psf + e.nbr));
      }
      return false;
   }
}