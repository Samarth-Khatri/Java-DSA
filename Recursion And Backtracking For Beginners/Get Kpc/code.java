import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
    }

    public static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    // Ex - 367
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add(""); // [""] -> 1
            return bres;
        }

        char ch = str.charAt(0); // 367 -> 3
        String ros = str.substring(1); //367 -> 67
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String code = codes[ch-48]; // convert char to int (ASCII-48 is done)

        for (int i=0;i<code.length();i++){
            char chi = code.charAt (i);
            for (String rstr: rres)
                mres.add (chi + rstr);
        }

        return mres;
    }

}
