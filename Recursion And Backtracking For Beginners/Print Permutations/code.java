import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0) {
            System.out.println(asf);
            return;
        }

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            String prei = str.substring(0,i);
            String posti = str.substring(i+1);
            String newstr = prei + posti;
            printPermutations(newstr,asf+ch);
        }
    }

}
