import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        ArrayList<String> ans = getMazePaths(1,1,rows,cols);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr || sc>dc) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        } else if(sr==dr && sc==dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mypaths = new ArrayList<>();

        // Horizontal
        for(int i=1;i<=dc-sc;i++) {
            ArrayList<String> hpaths = getMazePaths(sr,sc+i,dr,dc);
            for(String hpath: hpaths)
                mypaths.add("h" + i + hpath);
        }

        // Vertical
        for(int j=1;j<=dr-sr;j++) {
            ArrayList<String> vpaths = getMazePaths(sr+j,sc,dr,dc);
            for(String vpath: vpaths)
                mypaths.add("v" + j + vpath);
        }

        // Diagonal
        for(int k=1;k<=dc-sc && k<=dr-sr;k++) {
            ArrayList<String> dpaths = getMazePaths(sr+k,sc+k,dr,dc);
            for(String dpath: dpaths)
                mypaths.add("d" + k + dpath);
        }

        return mypaths;
    }

}
