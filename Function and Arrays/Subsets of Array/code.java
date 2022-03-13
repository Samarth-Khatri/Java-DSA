import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int limit = (int) Math.pow(2, n);
        for (int i = 0; i < limit; i++) {
            int temp = i;
            String ans = "";
            for (int j=arr.length-1;j>=0;j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    ans = "-\t" + ans;
                } else {
                    ans = arr[j] + "\t" + ans;
                }

            }
            System.out.println(ans);
        }
    }

}
