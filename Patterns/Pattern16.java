PRINT THE GIVEN PATTERN (N=5)

1								1
1	2						2	1
1	2	3				3	2	1
1	2	3	4		4	3	2	1
1	2	3	4	5	4	3	2	1

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int nsp = 2*n-3;
    int nst = 1;
    for(int i=1;i<=n;++i) {
        for(int j=1;j<=nst;++j) {
            System.out.print(j + "\t");
        }
        for(int j=1;j<=nsp;++j) {
            System.out.print("\t");
        }
        if(i==n)
            nst--;
        for(int j=nst;j>=1;--j) {
            System.out.print(j + "\t");
        }
        nsp -=2;
        nst++;
        System.out.println();
    }
 }
}
