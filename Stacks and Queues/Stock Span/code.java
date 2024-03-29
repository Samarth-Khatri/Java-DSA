import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve2(a);
    display(span);
 }

// Can also be done by making a class pair
// Pushing the index in stack instead of arr[i] from left
 public static int[] solve(int[] arr) {
    int[] ans = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    st.push(0);
    ans[0] = 1;
    for(int i=1;i<arr.length;++i) {
      while(!st.isEmpty() && arr[i] > arr[st.peek()]) st.pop();
      if(st.isEmpty()) ans[i] = i + 1;
      else ans[i] = i - st.peek();
      st.push(i);
    }
    return ans;
 }
 
 // Second Approach from right
 public static int[] solve2(int[] arr) {
    int[] ans = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    st.push(arr.length-1);
    for(int i=arr.length-2;i>=0;--i) {
      while(!st.isEmpty() && arr[i] >= arr[st.peek()]) 
        ans[st.peek()] = st.pop() - i;
      st.push(i);
    }
    while(!st.isEmpty()) 
      ans[st.peek()] = st.pop() + 1; 
    return ans;
 }

}