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
    int data=scn.nextInt();
    int low=0;
    int high=arr.length-1;
    int fi=-1;
    while(low<=high) {
        int mid=(low+high)/2;
        if(arr[mid]<data) {
            low=mid+1;
        }
        else if (arr[mid]>data) {
            high=mid-1;
        }
        else {
            fi=mid;
            high=mid-1;
        }
    }
    System.out.println(fi);
    low=0;
    high=arr.length-1;
    int li=-1;
    while(low<=high) {
        int mid=(low+high)/2;
        if(arr[mid]<data) {
            low=mid+1;
        }
        else if (arr[mid]>data) {
            high=mid-1;
        }
        else {
            li=mid;
            low=mid+1;
        }
    }
    
    System.out.println(li);
}

}