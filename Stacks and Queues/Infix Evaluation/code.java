import java.io.*;
import java.util.*;

public class Main{
  

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> vstack = new Stack<>(); // Value Stack
        Stack<Character> ostack = new Stack<>(); // Operator Stack
        for(int i=0;i<exp.length();++i) {
            char ch = exp.charAt(i);
            
            if(ch == '(') 
                ostack.push(ch);
            
            else if(ch >= '0' && ch <= '9') 
                vstack.push(ch - '0');
            
            else if(ch == ')') {
                while(!ostack.isEmpty() && ostack.peek() != '(') 
                    infixEvaluation(ostack, vstack); 
                ostack.pop();
            }
            
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(!ostack.isEmpty() && ostack.peek() != '(' 
                && priority(ostack.peek()) >= priority(ch)) 
                    infixEvaluation(ostack, vstack);
                ostack.push(ch);
            }
        }

        while(!ostack.isEmpty()) 
            infixEvaluation(ostack, vstack);

        System.out.println(vstack.pop());
    }

    public static void infixEvaluation(Stack<Character> ostack, Stack<Integer> vstack) {
        char op = ostack.pop();
        int val2 = vstack.pop();
        int val1 = vstack.pop();
        int ans = operation(val1,val2,op);
        vstack.push(ans);
    }

    public static int priority(char op) {
        if(op == '+' || op == '-') return 1;
        else return 2;
    }

    public static int operation(int val1, int val2, char op) {
        if(op == '+') return val1 + val2;
        else if(op == '-') return val1 - val2;
        else if(op == '/') return val1 / val2;
        else return val1 * val2;
    }
}