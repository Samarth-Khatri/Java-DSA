import java.io.*;
import java.util.*;

public class Main {

   static class Pair implements Comparable {
      int data;
      int li; // list index
      int di; // data index

      // +ve -> this is bigger
      // -ve -> this is smaller
      // 0 -> this and other are equal
      public int compareTo(Object o) {
         Pair other = (Pair)o;
         return this.data - other.data;
      }
   }

   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> res = new ArrayList<>();
      PriorityQueue<Pair> pq = new PriorityQueue<>();

      for(int li=0;li<lists.size();++li) { // adding the first element of every list in pq
         Pair p = new Pair();
         p.li = li; // list index = array traversal
         p.di = 0; // always taking the first data index
         p.data = lists.get(p.li).get(p.di); // getting the data of data index
         pq.add(p); // adding in pq
      }

      while(pq.size()>0) { // Traversing in pq
         Pair rp = pq.remove(); // removing the least value pair

         res.add(rp.data); // adding its data to our result arraylist

         rp.di++; // getting the next data index
         if(rp.di < lists.get(rp.li).size()) { // if elements left in the list of list index
            rp.data = lists.get(rp.li).get(rp.di); // save the new data of data index (which is next to the previous removed one)
            pq.add(rp); // add in pq
         }
      }

      return res;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}