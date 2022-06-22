import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    // priority -> dd < mm < yyyy
    // for dates
    countSort(arr,1000000,100,32); // 1 to 31 indexes -> range = 32

    // for months
    countSort(arr,10000,100,13); // 1 to 12 indexes -> range = 13

    // for years
    countSort(arr,1,10000,2501); // range given in ques 0-2500
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    int []farr = new int[range];
    String []ans = new String[arr.length];

    // collecting the frequencies
    for(int i=0;i<arr.length;++i) {
      int val = (Integer.parseInt(arr[i]) / div) % mod;
      farr[val]++;
    }

    // convert frequencies to prefix sum array
    for(int i=1;i<farr.length;++i) 
      farr[i] += farr[i-1];

    // fill the ans array from farr
    for(int i=arr.length-1;i>=0;--i) {
      int val = (Integer.parseInt(arr[i]) / div) % mod; // Sting arr to in convert
      int pos = farr[val];
      ans[pos-1] = arr[i];
      farr[val]--;
    }

    // fill the original array
    for(int i=0;i<ans.length;++i) 
      arr[i] = ans[i];  
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}