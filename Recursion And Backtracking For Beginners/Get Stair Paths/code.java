import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres; // [""] -> 1
        } else if(n<0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres; // [] -> 0
        }

        ArrayList<String> pathsfromNm1 = getStairPaths(n-1);
        ArrayList<String> pathsfromNm2 = getStairPaths(n-2);
        ArrayList<String> pathsfromNm3 = getStairPaths(n-3);

        ArrayList<String> pathsfromN = new ArrayList<>();

        for(String pathfromNm1: pathsfromNm1) {
            String pathfromN = "1" + pathfromNm1;
            pathsfromN.add(pathfromN);
        }

        for(String pathfromNm2: pathsfromNm2) {
            String pathfromN = "2" + pathfromNm2;
            pathsfromN.add(pathfromN);
        }

        for(String pathfromNm3: pathsfromNm3) {
            String pathfromN = "3" + pathfromNm3;
            pathsfromN.add(pathfromN);
        }

        return pathsfromN;
    }

}
