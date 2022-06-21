import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
    int []farr = new int[max-min+1];
    int []ans = new int[arr.length];

    // collecting the frequencies
    for(int i=0;i<arr.length;++i) 
      farr[arr[i]-min]++;

    // convert frequencies to prefix sum array
    for(int i=1;i<farr.length;++i) 
      farr[i] += farr[i-1];

    // fill the ans array from farr
    for(int i=arr.length-1;i>=0;--i) {
      int val = arr[i];
      int pos = farr[val-min];
      ans[pos-1] = val;
      farr[val-min]--;
    }

    // fill the original array
    for(int i=0;i<ans.length;++i) 
      arr[i] = ans[i];
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}