PRINT THE GIVEN PATTERN (N=5)

*
  *
    *
      *
        *


import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = 0;

        for(int i=1;i<=n;++i) {
            for(int j=0;j<nsp;++j)
                System.out.print("\t");
            for(int k=1;k<=nst;++k)
                System.out.print("*");
            nsp++;
            System.out.println();
        }

        // METHOD 2 GAP METHOD

        for(int i=1;i<=n;++i) {
            for(int j=1;j<=n;++j) {
                if(i-j==0)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
