import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;++i)
      arr[i] = scn.nextInt();
    int target = scn.nextInt();

    Arrays.sort(arr);

    int i=0;
    int j=arr.length-1;
    while(arr[i]+arr[j]!=target) {
      if(arr[j]+arr[i]>target) 
        j--;
      else
        i++;
    }
    if(arr[i]+arr[j]==target)
      System.out.println(arr[i] + "," + arr[j]);
  }
}