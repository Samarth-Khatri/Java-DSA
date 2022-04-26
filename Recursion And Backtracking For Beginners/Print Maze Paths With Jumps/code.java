import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
		int m = scn.nextInt();
		printMazePaths(1,1,n,m,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr>dr || sc>dc)
			return;
		else if(sr==dr && sc==dc)
			System.out.println(psf);

        for(int i=1;i<=dc;i++)
            printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
        for(int j=1;j<=dr;j++)
            printMazePaths(sr+j,sc,dr,dc,psf+"v"+j);
        for(int k=1;k<=Math.min(dr,dc);k++)
            printMazePaths(sr+k,sc+k,dr,dc,psf+"d"+k);
    }

}
