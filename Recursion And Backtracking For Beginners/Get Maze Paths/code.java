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
        ArrayList<String> myhpaths = getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> myvpaths = getMazePaths(sr+1,sc,dr,dc);

        for(String myhpath: myhpaths)
            mypaths.add("h" + myhpath);
        for(String myvpath: myvpaths)
            mypaths.add("v" + myvpath);

        return mypaths;
    }

}
