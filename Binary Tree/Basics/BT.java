import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;
  }

  static class Pair {
    Node node;
    int state;
  }

  // Logic 
  // state = 1 -> left child push
  // state = 2 -> right child push
  // state = 3 -> pop
  public static Node construct(Integer []arr) {
    Stack<Node> st = new Stack<>(); // Stack for Nodes
    Node root = new Node();
    root.data = arr[0];

    Pair rootp = new Pair();
    rootp.node = root;
    rootp.state = 1;

    st.push(rootp);
    int idx = 1;
    while(!st.isEmpty()) {
      Pair peekp = new Pair();
      if(peekp.state==1) {
        // left child
        if(arr[idx]!=null) {
          Node lc = new Node(); // make a new node for left child
          lc.data = arr[i]; // set left child data
          peekp.node.left = lc; // set left of peekp.node

          Pair leftp = new Pair(); // left child pair to push in stack
          leftp.node = lc;
          leftp.state = 1;

          st.push(leftp); // push pair in stack
        }
        peekp.state++; // increase state
        idx++; // increase index
      }
      else if(peekp.state==2) {
        // right child
        if(arr[idx]!=null) {
          Node rc = new Node(); // make a new node for right child
          rc.data = arr[i]; // set right child data
          peekp.node.right = rc; // set right of peekp.node

          Pair rightp = new Pair(); // right child pair to push in stack
          rightp.node = rc;
          rightp.state = 1;

          st.push(rightp); // push pair in stack
        }
        peekp.state++; // increase state
        idx++; // increase index
      }
      else if(peekp.state==3)
        // pop out
        st.pop();
    }
    return root;
  }

  public static void display(Node node) {

  }

  public static void main(String[] args) {
    Integer []arr = new Integer[] {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
    Node root = construct(arr);
    display(root);
  }
}