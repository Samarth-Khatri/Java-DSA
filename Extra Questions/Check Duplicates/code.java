import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for (int i=0;i<n;++i) 
      arr[i] = scn.nextInt();

    Arrays.sort(arr); // To sort Array -> Complexity O(NlogN)

    int dup = -1;
    for(int i=0;i<=arr.length-2;++i) 
      if(arr[i]==arr[i+1]) {
        dup = arr[i];
        break;
      }
    System.out.println(dup);
  }
}