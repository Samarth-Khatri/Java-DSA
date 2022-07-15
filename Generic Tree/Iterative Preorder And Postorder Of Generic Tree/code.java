import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  // Pair Class
  static class Pair {
    int state;
    Node node;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);

    // Logic ↓
    // State = -1 -> Add in Preorder and ++
    // State = 0 - child.size-1 ->  Child ++
    // State = child.size -> Add in Postorder and ++
    // State = child.size+1 -> Pop/Remove 
    String pre = "";
    String post = "";
    
    Stack<Pair> stack = new Stack<>();
    Pair rootp = new Pair(); // new pair
    
    rootp.state = -1;
    rootp.node = root;
    stack.push(rootp); // push pair in stack
    
    while(!stack.isEmpty()) { // untill stack is empty
      Pair peekp = stack.peek();

      if(peekp.state==-1) {
        pre += peekp.node.data + " ";
        peekp.state++;
      }
      else if(peekp.state >= 0 && peekp.state < peekp.node.children.size()) {
        Pair childp = new Pair();
        childp.state = -1;
        childp.node = peekp.node.children.get(peekp.state);
        stack.push(childp);
        peekp.state++;
      }
      else if(peekp.state == peekp.node.children.size()) {
        post += peekp.node.data + " ";
        peekp.state++;
      }
      else 
        stack.pop();
      }

    System.out.println(pre);
    System.out.println(post);
  }

}