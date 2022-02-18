import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int i, int j){
    while(j>i) {
      int temp=a[i];
      a[i]=a[j];
      a[j]=temp;
      i++; j--;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());
    int i=0;
    k%=n;
    if(k<0)
      k+=n;
    rotate(a,i,n-1);
    rotate(a,i,k-1);
    rotate(a,k,n-1);
    display(a);
 }

}
