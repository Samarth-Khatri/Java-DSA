import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  static class BSTclass {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    boolean isBST = true;
    Node lbstNode = null;
    int lbstSize = 0;
  }
  
  public static BSTclass lbst(Node node) {
    if(node == null)
      return new BSTclass();
    
    BSTclass lc = lbst(node.left); // left class
    BSTclass rc = lbst(node.right); // right class

    BSTclass mc = new BSTclass(); // my class
    mc.min = Math.min(node.data, Math.min(lc.min,rc.min));
    mc.max = Math.max(node.data, Math.max(lc.max,rc.max));
    mc.isBST = lc.isBST && rc.isBST && node.data>lc.max && node.data<rc.min;

    if(mc.isBST) {
      mc.lbstNode = node;
      mc.lbstSize = lc.lbstSize + rc.lbstSize + 1;
    }
    else if(lc.lbstSize > rc.lbstSize) {
      mc.lbstNode = lc.lbstNode;
      mc.lbstSize = lc.lbstSize;
    }
    else {
      mc.lbstNode = rc.lbstNode;
      mc.lbstSize = rc.lbstSize;
    }

    return mc;
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    
    System.err.println(lbst(root).lbstNode.data + "@" + lbst(root).lbstSize);
  }

}