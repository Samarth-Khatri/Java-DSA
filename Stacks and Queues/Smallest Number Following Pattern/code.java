import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Stack<Integer> st = new Stack<>();
    int j = 1;
    for(int i=0;i<str.length();++i) {
        char ch = str.charAt(i);
        if(ch == 'd') {
            st.push(j);
            j++;
        }
        else {
            st.push(j);
            j++;
            while(!st.isEmpty())
                System.out.print(st.pop());
        }
        if(i == str.length()-1) {
            st.push(j);
            while(!st.isEmpty())
                System.out.print(st.pop());
        }
    }
 }
}