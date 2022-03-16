import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int []arr = {-7, 1, 5, 2, -4, 3, 0};

    // METHOD 1 Brute Force
    for(int i=1;i<arr.length-1;++i) {
      int ls=0;
      for(int j=0;j<i;++j)
        ls+=arr[j];
      int rs=0;
      for(int k=i+1;k<arr.length;++k)
        rs+=arr[k];
      if(ls==rs)
        System.out.println(i);
        System.exit(0);
    }

  }
}
