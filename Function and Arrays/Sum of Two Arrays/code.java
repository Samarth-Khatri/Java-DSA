import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int []a1 = new int[n1];
    for(int i=0;i<n1;++i) {
        a1[i]=scn.nextInt();
    }
    int n2 = scn.nextInt();
    int []a2 = new int[n2];
    for(int i=0;i<n2;++i) {
        a2[i]=scn.nextInt();
    }
    int n3 = Math.max(n1,n2)+1;
    int[] ans = new int[n3];
    int carry = 0;
    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = ans.length - 1;
    while (k>=0) {
        int sum=0;
        if (i>=0)
            sum += a1[i];
        if (j>=0)
            sum += a2[j];
        sum+=carry;
        int q=sum/10;
        int rem=sum%10;
        carry=q;
        ans[k]=rem;
        i--; j--; k--;
    }
    for(int a=0;a<ans.length;++a) {
        if(a==0 && ans[a]==0){}
        else
            System.out.println(ans[a]);
    }
 }

}
