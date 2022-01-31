PRINT THE PATTERN

0
1	1
2	3	5
8	13	21	34

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int nst = 1;
        for(int i=1;i<=n;++i) {
            for(int j=1;j<=nst;++j) {
                System.out.print(a + "\t");
                int c=a+b;
                a=b;
                b=c;
            }
            nst++;
            System.out.println();
        }

    }
}
