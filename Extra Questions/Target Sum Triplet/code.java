import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;++i)
      arr[i] = scn.nextInt();
    int target = scn.nextInt();

    Arrays.sort(arr); // Complexity O(NlogN)

    for(int i=0;i<=arr.length-3;++i) { // Complexity O(N^2)
      int utarget = target - arr[i];
      int k=i+1;
      int j=arr.length-1;

      while(k<j) { 
        if(arr[j]+arr[k]>utarget) 
          j--;
        else if(arr[j]+arr[k]<utarget)
          k++;
        else {
          System.out.println(arr[i] + "," + arr[k] + "," + arr[j]);
          k++; j--;
        }
      }
    }

  }
}