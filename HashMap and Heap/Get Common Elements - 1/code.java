import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int []arr1 = new int[n1];
    for(int i=0;i<n1;++i)
        arr1[i] = scn.nextInt();
    
    int n2 = scn.nextInt();
    int []arr2 = new int[n2];
    for(int i=0;i<n2;++i)
        arr2[i] = scn.nextInt();

    // travel through arr1 and fill map
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<arr1.length;++i) {
        if(map.containsKey(arr1[i])) 
            map.put(arr1[i], map.get(arr1[i])+1);
        else
            map.put(arr1[i], 1);
    }

    // traverse in arr2 and print and remove if element found
    for(int i=0;i<arr2.length;++i) 
        if(map.containsKey(arr2[i])) {
            System.out.println(arr2[i]);
            map.remove(arr2[i]);
        }
 }

}