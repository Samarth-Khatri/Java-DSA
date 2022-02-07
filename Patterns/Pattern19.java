PRINT THE PATTERN (N=9)

*	*	*	*	*				*
				*				*
				*				*
				*				*
*	*	*	*	*	*	*	*	*
*				*
*				*
*				*
*				*	*	*	*	*

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int i=1;i<=n;++i) {
        for(int j=1;j<=n;++j) {

            // First row
            if(i==1) {
                    if(j<=n/2+1 || j==n)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
            }

            //Second to Middle-1
            if(i>1 && i<=n/2) {
                    if(j==n/2+1 || j==n)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
            }

            //Middle row
            if(i==n/2+1)
                    System.out.print("*\t");

            //Middle+1 to N-1
            if(i>n/2+1 && i<n) {
                    if(j==1 || j==n/2+1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
            }

            //Last row
            if(i==n) {
                    if(j==1 || j>=n/2+1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
            }
        }
        System.out.println();
    }
 }
}
