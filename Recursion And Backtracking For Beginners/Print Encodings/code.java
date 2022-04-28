import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str,"");
    }

    public static void printEncodings(String str, String ans) {
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }

        // Call 1
        char ch = str.charAt(0);
        if(ch=='0')
            return;
        int num = ch - '0'; // OR ch - 48
        char chtobeadded = (char)('a' + num - 1);
        printEncodings(str.substring(1), ans+chtobeadded);

        // Call 2
        if(str.length()>1) {
            char ch2 = str.charAt(1);
            int num2 = ch2 - '0';
            int fnum = num*10 + num2;
            if(fnum<=26) {
                char ch2tobeadded = (char)('a' + fnum - 1);
                printEncodings(str.substring(2), ans+ch2tobeadded);
            }
        }
    }
}
