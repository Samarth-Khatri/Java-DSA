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
    int max=arr[0];
    for(int i=0;i<n;++i) {
        if(arr[i]>max)
            max=arr[i];
    }
    print(arr,max);
 }
 public static void print(int []arr1, int maxLen) {
     for(int i=maxLen;i>0;--i) {
        for(int j=0;j<arr1.length;++j) {
            if(i>arr1[j])
                System.out.print("\t");
            else
                System.out.print("*\t");
        }
        System.out.println();
    }
 }

}
