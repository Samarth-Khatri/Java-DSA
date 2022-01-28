PRINT THE GIVEN PATTERN (N=5)

* * * * *
* * * *
* * *
* *
*

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // METHOD 1
        for(int i=1;i<=n;++i) {
            for(int j=i;j<=n;++j)
                System.out.print("*\t");
            System.out.println();
        }

        // METHOD 2
        int nst = n;    //Number of stars
        int nsp = 0;    //Number of spaces

        for(int i=1;i<=n;++i) {
            for(int j=1;j<=nst;++j)
                System.out.print("*\t");
            nst--;
            System.out.println();
        }
    }
}
