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

  public static boolean find(Node node, int data){
    if(node == null)
      return false;
    if(data == node.data)
      return true;
    return (data>node.data) ? find(node.right,data) : find(node.left,data);
  }  


  // Approach 1 = Inorder Traversal
  // Tc -> O(hN) => Sc -> O(h)    h = height of tree
  public static void sumPair(Node root, Node node, int data) {
    if(node == null) return;

    sumPair(root,node.left,data);
    
    int tdata = data - node.data;
    if(node.data < tdata) 
      if(find(root,tdata))
        System.out.println(node.data + " " + tdata);

    sumPair(root,node.right,data);
  }


  // Approach 2 = ArrayList Approach
  // Tc -> O(N) => Sc -> O(N)
  public static void tnf(Node node, ArrayList< Integer> list) {
    if (node == null)
      return;

    tnf(node.left, list);
    list.add(node.data);
    tnf(node.right, list);
  }


  // Approach 3 -> taking one from start using normal inorder and one from end using reverse inorder
  // Tc -> O(N) => Sc -> O(h)    h = height of tree
  public static class ITPair {
    Node node;
    int state = 0;

    ITPair() {};

    ITPair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static void bestApproach(Node node, int tar) {
    Stack< ITPair> ls = new Stack< >();
    Stack< ITPair> rs = new Stack< >();

    ls.push(new ITPair(node, 0));
    rs.push(new ITPair(node, 0));

    Node left = getNextFromNormalInorder(ls);
    Node right = getNextFromReverseInorder(rs);
    while (left.data < right.data) { // just like array
      if(left.data + right.data < tar)
        left = getNextFromNormalInorder(ls);
      else if (left.data + right.data > tar)
        right = getNextFromReverseInorder(rs);
      else {
        System.out.println(left.data + " " + right.data);
        left = getNextFromNormalInorder(ls);
        right = getNextFromReverseInorder(rs);
      }
    }
  }

  public static Node getNextFromNormalInorder(Stack< ITPair> st) {
    while (st.size() > 0) {
      ITPair top = st.peek();
      if (top.state == 0) {
        if (top.node.left != null)
          st.push(new ITPair(top.node.left, 0));
        top.state++;
      }
      else if (top.state == 1) {
        if (top.node.right != null)
          st.push(new ITPair(top.node.right, 0));
        top.state++;
        return top.node;
      }
      else st.pop();
    }
    return null;
  }

  public static Node getNextFromReverseInorder(Stack< ITPair> st) {
    while (st.size() > 0) {
      ITPair top = st.peek();
      if (top.state == 0) {
        if (top.node.right != null)
          st.push(new ITPair(top.node.right, 0));
        top.state++;
      }
      else if (top.state == 1) {
        if (top.node.left != null)
          st.push(new ITPair(top.node.left, 0));
        top.state++;
        return top.node;
      }
      else st.pop();
    }
    return null;
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

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    
    // 1 ->
    sumPair(root,root,data);


    // 2 ->
    ArrayList< Integer> list = new ArrayList< >();
    tnf(root, list);
    int li = 0;
    int ri = list.size() - 1;
    while (li < ri) {
      int left = list.get(li);
      int right = list.get(ri);
      if (left + right > data)
        ri--;
      else if (left + right < data)
        li++;
      else {
        System.out.println(left + " " + right);
        li++;
        ri--;
      }
    }


    // 3 ->
    bestApproach(root, data);
  }
}