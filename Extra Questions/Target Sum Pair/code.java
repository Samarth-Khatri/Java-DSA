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

    int i=0;
    int j=arr.length-1;

    // We can also use Binary Search instead of this -> Complexity O(NlogN) 
    while(i<j) { // Complexity O(N)
      if(arr[j]+arr[i]>target) 
        j--;
      else if(arr[j]+arr[i]<target)
        i++;
      else {
        System.out.println(arr[i] + "," + arr[j]);
        i++; j--;
      }
    }
  }
}