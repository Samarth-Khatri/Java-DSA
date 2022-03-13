import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;++i) {
        arr[i]=scn.nextInt();
    }
    int floor=-1, ceil=-1;
    int data = scn.nextInt();
    int low=0;
    int high=arr.length-1;
    while(low<=high) {
        int mid = (low+high)/2;
        if(arr[mid]==data) {
            floor=arr[mid];
            ceil=arr[mid];
            break;
        }
        if(arr[mid]>data) {
            ceil=arr[mid];
            high=mid-1;
        }
        if(arr[mid]<data) {
            floor=arr[mid];
            low=mid+1;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }

}
