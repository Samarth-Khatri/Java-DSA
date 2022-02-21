import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter no. of elements in Array");
    int n = scn.nextInt();
    System.out.println("Enter sorted Array");
    int []arr = new int[n];
    for(int i=0;i<n;++i) {
        arr[i]=scn.nextInt();
    }
    System.out.println("Enter the element to search for");
    int f = scn.nextInt();
    int low=0;
    int high=arr.length-1;
    while(low<=high) {
        int mid = (low+high)/2;
        if(arr[mid]==f) {
            System.out.println("Element Found at "+mid);
            System.exit(0);
        }
        if(arr[mid]>f)
            high=mid-1;
        if(arr[mid]<f)
            low=mid+1;
    }
    System.out.println("Element not found");
 }

}
