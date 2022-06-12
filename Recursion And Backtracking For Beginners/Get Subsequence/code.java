import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }

    // Time Complexity -> O(2^N)

    public static ArrayList<String> gss(String str) {
        // Base case
        if(str.length()==0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres; // bres -> [""] 1 element with size 0 [bres.get(0).length=0]
        }

        char ch = str.charAt(0); // abc -> a
        String ros = str.substring(1); // abc -> bc
        ArrayList<String> rres = gss(ros); //gss(bc) -> [--,-c,b-,bc]
        ArrayList<String> mres = new ArrayList<>();

        for(String rstr: rres)
            mres.add("" + rstr); // [---,--c,-b-,-bc]
        for(String rstr: rres)
            mres.add(ch + rstr); // [a--,a-c,ab-,abc]

        return mres;
    }

}
