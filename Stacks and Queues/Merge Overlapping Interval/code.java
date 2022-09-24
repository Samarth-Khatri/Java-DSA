import java.io.*;
import java.util.*;

public class Main {

    static class Pair implements Comparable<Pair>{
        int st; // start time
        int et; // end time

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        public int compareTo(Pair other) {
            if(this.st == other.st)
                return this.et - other.et;
            else return this.st - other.st;
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;++i) 
            pq.add(new Pair(arr[i][0], arr[i][1]));
        Stack<Pair> st = new Stack<>();
        
        for(int i=0;i<arr.length;++i) {
            if(i == 0) st.push(pq.remove());
            else {
                Pair top = st.peek();
                Pair curr = pq.remove();
                if(curr.st > top.et) st.push(curr);
                else top.et = Math.max(top.et, curr.et);
            }
        } 
        
        Stack<Pair> ans = new Stack<>();
        while(!st.isEmpty()) 
            ans.push(st.pop());
        
        while(!ans.isEmpty()) {
            Pair rem = ans.pop();
            System.out.println(rem.st + " " + rem.et);
        }
            
    }

}