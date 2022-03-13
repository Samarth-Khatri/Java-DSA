import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        int cnt;
        for(int i=low; i<=high; ++i) {
            cnt=0;
            for(int j=2; j*j<=i; ++j) {
                if(i%j==0)
                    cnt++;
                if(cnt==1)
                    break;
            }
            if(cnt==0)
                System.out.println(i);
        }
    }
}
