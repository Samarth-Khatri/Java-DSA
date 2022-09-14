import java.util.*;

public class Main {
   
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      Stack<Character> st = new Stack<>();
      for(int i=0;i<str.length();++i) {
         if(str.charAt(i) == ')') {
            if(st.peek() == '(') {
                System.out.println(true);
                return;
            }
            else {
                while(!st.isEmpty() && st.peek() != '(') 
                    st.pop();
                st.pop();
            }
         }
         else
            st.push(str.charAt(i));
      }
      System.out.println(false); 
   }
}