import java.io.*;
import java.util.*;

public class Main {
   static class Pair {
      int vtx;
      int doi;

      Pair(int vtx, int doi) {
         this.vtx = vtx;
         this.doi = doi;
      }
   }

   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      Queue<Pair> que = new ArrayDeque<>();
      que.add(new Pair(src,1));
      boolean []visited = new boolean[vtces];
      int cnt = 0;

      while(!que.isEmpty()) {
         // remove -> mark* -> work(display) -> add*
         
         // Remove
         Pair rem = que.remove();
         if(rem.doi > t) break; // check for days of infection

         // Mark*
         if(visited[rem.vtx]) continue;
         visited[rem.vtx] = true;

         // Work
         cnt++;

         // Add*
         for(Edge e : graph[rem.vtx])
            if(!visited[e.nbr])
               que.add(new Pair(e.nbr, rem.doi + 1));
      } 

      System.out.println(cnt);
   }

}