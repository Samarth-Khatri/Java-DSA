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

    // We can also use Binary Search instead of the above code -> Complexity O(NlogN) 
    // Binary Search the compliment
    for(inti=0;i<arr.length;i++){
      int theOtherNumber = tar-arr[i];
      if(theOtherNumber<arr[i])
        break;

      // Binary Search the new Target
      int left=0;
      int right=arr.length-1;
      while(left<=right){
          int mid=(left+right)/2;
          if(theOtherNumber<arr[mid])
            right=mid-1;
          else if(theOtherNumber>arr[mid])
            left=mid+1;
          else {
            System.out.println(arr[i]+""+arr[mid]);
            break;
          }
      }
    }
  }
}