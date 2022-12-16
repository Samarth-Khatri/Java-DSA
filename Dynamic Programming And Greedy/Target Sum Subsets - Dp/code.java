import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; ++i) arr[i] = scn.nextInt();
    int tar = scn.nextInt();
    System.out.println(
      sumSub_mem(arr, 0, tar, new Boolean[arr.length + 1][tar + 1])
    );
  }

  public static boolean sumSub_mem(int[] arr, int idx, int tar, Boolean[][] strg) {
    if (tar == 0) return true; 
    else if (idx == arr.length) return false;

    if (tar >= 0 && strg[idx][tar] != null) return strg[idx][tar];

    boolean exclude = sumSub_mem(arr, idx + 1, tar, strg);
    boolean include = sumSub_mem(arr, idx + 1, tar - arr[idx], strg);
    boolean ans = exclude || include;
    if (tar >= 0) strg[idx][tar] = ans;
    
    return ans;
  }
}
