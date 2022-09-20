import java.io.*;
import java.util.*;

public class Main{
  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> vstack = new Stack<>();
        Stack<String> in = new Stack<>();
        Stack<String> post = new Stack<>();

        for(int i=exp.length()-1;i>=0;--i) {
            char ch = exp.charAt(i);

            if(ch >= '0' && ch <= '9') {
                vstack.push(ch - '0');
                in.push(ch + "");
                post.push(ch + "");
            }

            else {
                int v1 = vstack.pop();
                int v2 = vstack.pop();
                vstack.push(operation(v1,v2,ch));

                // Infix -> (val1 + op + val2)
                String inv1 = in.pop();
                String inv2 = in.pop();
                in.push("(" + inv1 + ch + inv2 + ")");

                // Postfix -> val1 + val2 + op
                String postv1 = post.pop();
                String postv2 = post.pop();
                post.push(postv1 + postv2 + ch);
            }
        }
        System.out.println(vstack.pop());
        System.out.println(in.pop());
        System.out.println(post.pop());
    }

    public static int operation(int v1, int v2, char ch) {
        if(ch == '+') return v1+v2;
        else if(ch == '-') return v1-v2;
        else if(ch == '*') return v1*v2;
        else return v1/v2;
    }
}