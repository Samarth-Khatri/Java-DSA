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

  // Parent Queue - Child Queue Approach
  public static void levelOrder1(Node node) {  
    LinkedList<Node> que = new LinkedList<>(); // Using linked list as queue
    LinkedList<Node> cque = new LinkedList<>();
    que.addLast(node);

    while(que.size()>0) {
      // remove -> print -> add children
      Node temp = que.removeFirst();
      System.out.print(temp.data + " ");
      if(temp.left!=null)
        cque.addLast(temp.left);
      if(temp.right!=null)
        cque.addLast(temp.right);
      if(que.size()==0) {
        que = cque;
        cque = new LinkedList<>();
        System.out.println();
      }

    }
  }

  // Using One Queue -> Count Approach
  public static void levelOrder2(Node node) {  
    LinkedList<Node> que = new LinkedList<>(); // Using linked list as queue
    que.addLast(node);

    while(que.size()>0) {
      int currSize = que.size(); // taking current size and looping that times
      while(currSize-->0) {
        Node temp = que.removeFirst();
        System.out.print(temp.data + " ");
        if(temp.left!=null)
          que.addLast(temp.left);
        if(temp.right!=null)
          que.addLast(temp.right);
      }
      System.out.println();
    }
  }

 // Using One Queue -> Delimeter Approach
  public static void levelOrder3(Node node) {  
    LinkedList<Node> que = new LinkedList<>(); 
    que.addLast(node);
    Node delim = new Node(-1,null,null);
    que.addLast(delim); // Added to identify where next line should start
    
    while(que.size()>0) {
      Node temp = que.removeFirst();
      if(temp.data==-1) { // If we encounter delim go to next line
        System.out.println();
        if(que.size()>0)
          que.addLast(delim);
        continue;
      }
      System.out.print(temp.data + " ");
      if(temp.left!=null)
        que.addLast(temp.left);
      if(temp.right!=null)
        que.addLast(temp.right);
    }
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
    levelOrder3(root);
  }

}