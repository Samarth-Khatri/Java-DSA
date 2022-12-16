import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; ++i) arr[i] = scn.nextInt();
    int tar = scn.nextInt();
    
    // System.out.println(
    //   sumSub_mem(arr, 0, tar, new Boolean[arr.length + 1][tar + 1])
    // );

    Boolean[][] strg = new Boolean[n + 1][tar + 1];

    for (int i = 0; i < strg.length; ++i) {
      for (int j = 0; j < strg[0].length; ++j) {
        if (i == 0 && j == 0) strg[i][j] = true; 
        else if (i == 0) strg[i][j] = false; 
        else if (j == 0) strg[i][j] = true; 
        else {
          strg[i][j] = strg[i - 1][j];
          int val = arr[i - 1];
          if (j >= val && strg[i - 1][j - val]) strg[i][j] = true;
        }
      }
    }
    System.out.println(strg[n][tar]);
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
