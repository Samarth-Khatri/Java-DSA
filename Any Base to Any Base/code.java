import java.util.*;

  public class Main{

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans=abtd(n, sourceBase);
     int res=dtab(ans, destBase);

     System.out.print(res);
   }
   public static int abtd(int n, int b){
      int ans=0;
      int power=1;
      while(n>0) {
         int rem=n%10;
         ans += (rem*power);
         n/=10;
         power*=b;
      }
      return ans;
   }
   public static int dtab(int n, int b){
       int power=1;
        int ans=0;
       while(n>0) {
           int rem=n%b;
           n/=b;
           ans+=(rem*power);
           power*=10;
       }
       return ans;
    }
  }
