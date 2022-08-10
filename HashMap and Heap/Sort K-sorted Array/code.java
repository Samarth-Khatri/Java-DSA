import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      
      // Simple Approach = Tc -> O(NlogN), Sc -> O(N)
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i=0;i<n;++i)
         pq.add(arr[i]);
      for(int i=0;i<n;++i)
         System.out.println(pq.remove());

      // Better Approach = Tc -> O((N+k)logk), Sc -> O(k)
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      int i=0;
      for(;i<k+1;++i)
         pq.add(arr[i]);
      for(;i<n;++i) {
            System.out.println(pq.remove());
            pq.add(arr[i]);
      }
      while(pq.size() > 0)
         System.out.println(pq.remove());
   }

}