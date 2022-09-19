import java.io.*;
import java.util.*;

public class Main{
  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Character> ostack = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        for(int i=0;i<exp.length();++i) {
            char ch = exp.charAt(i);
            
            if(ch == '(') 
                ostack.push(ch);
            
            else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || ch >= 'A' && ch <= 'Z') {
                pre.push(ch + "");
                post.push(ch + "");
            } 
                
            else if(ch == ')') {
                while(!ostack.isEmpty() && ostack.peek() != '(') 
                    infixConversion(ostack, pre, post); 
                ostack.pop();
            }
            
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(!ostack.isEmpty() && ostack.peek() != '(' 
                && priority(ostack.peek()) >= priority(ch)) 
                    infixConversion(ostack, pre, post);
                ostack.push(ch);
            }
        }

        while(!ostack.isEmpty()) 
            infixConversion(ostack, pre, post);

        System.out.println(post.pop());
        System.out.println(pre.pop());
    }
    
    // Prefix -> Operator + value 1 + value 2
    // Postfix -> value 1 + value 2 + operator
    public static void infixConversion(Stack<Character> ostack, Stack<String> pre, Stack<String> post) {
        char op = ostack.pop();
        String preval2 = pre.pop();
        String preval1 = pre.pop();
        pre.push(op + preval1 + preval2);

        String postval2 = post.pop();
        String postval1 = post.pop();
        post.push(postval1 + postval2 + op);
    }

    public static int priority(char op) {
        if(op == '+' || op == '-') return 1;
        else return 2;
    }
}