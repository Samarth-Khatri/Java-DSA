import java.util.*;

  public class Main{

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t=scn.nextInt();
        for (int j=1;j<=t;++j) {
        int cnt=0;
        int n = scn.nextInt();
        for(int i=2;i*i<=n;++i) {
            if(n%i==0)
                ++cnt;
            if(cnt==1)
                break;
        }
        if(cnt==1)
            System.out.println("not prime");
        else
            System.out.println("prime");
        }
    }
  }
