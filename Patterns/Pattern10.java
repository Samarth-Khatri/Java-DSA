PRINT THE GIVEN PATTERN (N=5)

    *
  *   *
*       *
  *   *
    *


import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

        // METHOD 1 MATRIX METHOD
        for(int i=1;i<=n;++i) {
            for(int j=1;j<=n;++j) {
                if(i-j==n/2 || i+n/2==j || i+j==n+(n/2+1) || i+j==n-(n/2-1))
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

        //METHOD 2 NSP NST
        int nsp1 = n/2;
        int nsp2 = -1;

        for(int i=1;i<=n;++i) {

            for(int j=1;j<=nsp1;++j)
                System.out.print("\t");

            System.out.print("*\t");

            for(int k=1;k<=nsp2;++k)
                System.out.print("\t");

            if(i!=1 && i!=n)
                System.out.print("*\t");
            if(i<=n/2) {
                nsp1--;
                nsp2+=2;
            }
            else {
                nsp1++;
                nsp2-=2;
            }
            System.out.println();
        }
 }
}
