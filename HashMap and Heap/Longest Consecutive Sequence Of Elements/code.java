import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;++i)
        arr[i] = scn.nextInt();

    HashMap<Integer, Boolean> map = new HashMap<>();
    for(int val : arr)
        map.put(val, true);
    
    for(int val : arr)
        if(map.containsKey(val-1))
            map.put(val, false);

    int msp = 0; // max starting point
    int mlen = 0; // max length
    for(int val : arr) {
        if(map.get(val)) {
            int tsp = val;
            int tlen = 1;

            while(map.containsKey(tsp+tlen))
                tlen++;

            if(tlen > mlen) {
                mlen = tlen;
                msp = tsp;
            }
        }
    }

    for(int i=0;i<mlen;++i)
        System.out.println(msp+i);
 }

}