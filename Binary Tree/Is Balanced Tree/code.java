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

  // Method 1 -> Travel and Tweak -> Using global variable
  static boolean isTreeBal = true;
  public static int balance(Node node) {
    if(node==null)
      return -1;
    int lh = balance(node.left);
    int rh = balance(node.right);
    if(!(Math.abs(lh-rh)<=1))
      isTreeBal = false;
    return Math.max(lh,rh)+1;
  }

  // Method 2 -> Pair method
  static class BalPair{
    int height = -1;
    boolean isBal = true;
  }

  public static BalPair balance2(Node node) {
    if(node==null) {
      BalPair bp = new BalPair();
      bp.height = -1;
      bp.isBal = true;
      return bp;
    }

    BalPair lp = balance2(node.left);
    BalPair rp = balance2(node.right);

    BalPair mp = new BalPair();
    mp.height = Math.max(lp.height, rp.height) + 1;
    mp.isBal = lp.isBal && rp.isBal && (Math.abs(lp.height - rp.height) <= 1);
    
    return mp;
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
    
    balance(root);
    System.out.println(isTreeBal);

    BalPair ansp = balance2(root);
    System.out.println(ansp.isBal);
  }

}