import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;
  }

  public static Node construct(int[] sarr, int lo, int hi) {
    if(lo>hi)
      return null;
    int mid = lo+(hi-lo)/2;
    Node node = new Node();
    node.data = sarr[mid];
    node.left = construct(sarr,lo,mid-1);
    node.right = construct(sarr,mid+1,hi);
    return node;
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

  public static void main(String[] args) throws Exception {
    int []sarr = {12,25,37,50,62,75,87};
    Node root = construct(sarr,0,sarr.length-1);
    display(root);
  }

}