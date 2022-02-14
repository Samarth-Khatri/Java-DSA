import java.util.*;

  public class Main{

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();

      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }

   public static int getDifference(int b, int n1, int n2){
       int ans = 0;
       int borrow = 0;
       int power = 1;

       while (n2>0) { //n2>n1 is also correct condition
           int ld1 = n1%10;
           int ld2 = n2%10;

           n1 /= 10;
           n2 /= 10;

           int diff = ld2 - ld1 - borrow;
           if (diff < 0) {
               borrow = 1;
               diff += b;
           } else {
               borrow = 0;
           }

           ans += (diff*power);
           power *= 10;
       }
       return ans;

   }

  }
