import java.io.*;
import java.util.*;

public class Main {

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
    for(int val : arr1) {
      if(map.containsKey(val)) 
        map.put(val, map.get(val)+1);
      else
        map.put(val, 1);
    }

    // traverse in arr2 and print and decrease count by 1
    for(int val : arr2)
      if(map.containsKey(val) && map.get(val) > 0) {
        System.out.println(val);
        map.put(val, map.get(val)-1);
      }
  }

}