import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    int[] dp = new int[str.length() + 1];
    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i < dp.length; ++i) {
      char chi = str.charAt(i - 1);
      char chim1 = str.charAt(i - 2);

      if (chi != '0') dp[i] = dp[i - 1];
      if (chim1 != '0' && Integer.parseInt("" + chim1 + chi) <= 26) dp[i] += dp[i - 2];
    }
    System.out.println(dp[str.length()]);
  }
}
