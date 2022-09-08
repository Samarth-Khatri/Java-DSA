import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   static class Pair {
      int vtx;
      String psf;

      Pair(int vtx, String psf) {
         this.vtx = vtx;
         this.psf = psf;
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

      Stack<Pair> st = new Stack<>();
      st.push(new Pair(src,src+""));
      boolean []visited = new boolean[vtces];

      while(!st.isEmpty()) {
         // remove -> mark* -> work(display) -> add*
         
         // Remove
         Pair rem = st.pop();

         // Mark*
         if(visited[rem.vtx]) continue;
         visited[rem.vtx] = true;

         // Work
         System.out.println(rem.vtx + "@" + rem.psf);

         // Add*
         for(Edge e : graph[rem.vtx])
            if(!visited[e.nbr])
               st.push(new Pair(e.nbr, rem.psf + e.nbr));
      }  
   }
}