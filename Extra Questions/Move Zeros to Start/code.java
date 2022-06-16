import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;++i)
      arr[i]=scn.nextInt();
    
    int i=n-1, j=n-1;
    while(i>=0) {
      if(arr[i]==0)
        i--;
      else 
        swap(arr,i--,j--);
    }
    for(int k=0;k<n;++k)
      System.out.println(arr[k]);
  }

  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}