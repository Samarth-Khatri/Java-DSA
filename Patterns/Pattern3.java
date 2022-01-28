PRINT THE PATTERN (N=5)

          *
        * *
      * * *
    * * * *
  * * * * *

  import java.util.*;

  public class Main {

      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          int nst = 1;    //Number of stars
          int nsp = n-1;    //Number of spaces

          for(int i=1;i<=n;++i) {
              for(int k=1;k<=nsp;++k)
                  System.out.print("\t");
              nsp--;
              for(int j=1;j<=nst;++j)
                  System.out.print("*\t");
              nst++;
              System.out.println();
          }
      }
  }
