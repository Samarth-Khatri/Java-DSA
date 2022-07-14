import java.io.*;
 
import java.util.*;
 
public class Main {
  private static class Node {
    int data;
    ArrayList< Node> children = new ArrayList< >();
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
 
    Stack< Node> st = new Stack< >();
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
  //******************************MULTISOLVER*******************************
  

  // METHOD 1 
  static int sum = 0;        
  static int min = Integer.MAX_VALUE;
  static int max = Integer.MIN_VALUE;
  static int height = -1;
 
  public static void multisolver(Node node, int depth) { 
 
    sum+=node.data;  
    min = Math.min(min, node.data);
    max = Math.max(max, node.data);
    height = Math.max(height, depth);
 
    for (Node child : node.children) { 
      multisolver(child,depth+1);
    }
  }


  // METHOD 2
  public static class HeapOver {
    int sum = 0;        
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int height = -1;
  }
    
  public static void multisolver2(Node node, int depth, HeapOver mover) { 
    mover.sum += node.data;  
    mover.min = Math.min(mover.min, node.data);
    mover.max = Math.max(mover.max, node.data);
    mover.height = Math.max(mover.height, depth);
 
    for (Node child : node.children) { 
      multisolver(child,depth+1);
    }
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
    

    // METHOD 1
    multisolver(root,0);
    System.out.println("Sum = " + sum);
    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
    System.out.println("Height = " + height);


    // METHOD 2 
    HeapOver mover = new HeapOver();
    multisolver2(root,0,mover);
    System.out.println("Sum = " + mover.sum);
    System.out.println("Min = " + mover.min);
    System.out.println("Max = " + mover.max);
    System.out.println("Height = " + mover.height);
  }
 
}
