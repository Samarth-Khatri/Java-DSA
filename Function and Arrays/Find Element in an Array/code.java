import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;++i) {
        arr[i] = scn.nextInt();
    }
    int d = scn.nextInt();
    System.out.print(findElement(arr,d));
    
 }
public static int findElement(int []arr1, int d) {
    for(int i=0;i<arr1.length;++i) {
        if(arr1[i]==d)
            return i;
    }
    return -1;
}
}
