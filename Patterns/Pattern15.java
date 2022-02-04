PRINT THE GIVEN PATTERN (N=5)

      1
    2	3	2
  3	4	5	4	3
    2	3	2
      1

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n/2;
        int onum = 1;
        for(int i=1;i<=n;++i) {
            int inum = onum;
            for(int j=1;j<=nsp;++j) {
                System.out.print("\t");
            }
            for(int j=1;j<=nst;++j) {
                if(j<=nst/2) {
                    System.out.print(inum + "\t");
                    inum++;
                }
                else {
                    System.out.print(inum + "\t");
                    inum--;
                }
            }
            if(i<=n/2) {
                nsp--;
                nst +=2;
                onum++;
            }
            else {
                nsp++;
                nst -=2;
                onum--;
            }
            System.out.println();

        }
    }
}
