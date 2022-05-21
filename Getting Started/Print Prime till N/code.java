// BRUTE FORCE -> Complexity O(n√n)

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



// OPTIMIZED SOLUTION -> Sieve of Eratosthenes Algorithm -> Complexity O(N*loglog(N)) 

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    boolean []arr = new boolean[n+1];

    for(int i=2;i*i<arr.length;++i)
      if(arr[i]==false)
        for(int j=i;j*i<arr.length;++j)
          arr[j*i]=true;

    for(int i=2;i<arr.length;++i)
      if(arr[i]==false)
        System.out.println(i);
  }
}
