import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;++i)
      arr[i]=scn.nextInt();
    
    int m=0;
    for(int i=0;i<n;++i)
      if(arr[i]>0)
        arr[m++]=arr[i];
    for(int i=m;i<n;++i)
      arr[i]=0;
    for(int i=0;i<n;++i)
      System.out.println(arr[i]);
  }
}