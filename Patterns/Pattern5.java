PPRINT THE GIVEN PATTERN (N=5)

    *
  * * *
* * * * *
  * * *
    *


import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;    //Number of stars
        int nsp = n/2;    //Number of spaces

        for(int i=1;i<=n;++i) {
            for(int k=1;k<=nsp;++k)
                System.out.print("\t");
            for(int j=1;j<=nst;++j)
                System.out.print("*\t");

            if(i<=n/2) {
                nst+=2;
                nsp--;
            }
            else {
                nst-=2;
                nsp++;
            }
            System.out.println();
        }

    }
}
