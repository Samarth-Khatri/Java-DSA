import java.util.*;
import java.io.*;

public class morris {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public static void pushAllLeft(TreeNode node, LinkedList<TreeNode> stack) {
        while (node != null) {
            stack.addFirst(node);
            node = node.left;
        }
    }

    public static void inOrder_stack(TreeNode node) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        pushAllLeft(node, stack);
        while(stack.size() != 0) {
            TreeNode rn = stack.removeFirst();
            System.out.println(rn.val + " ");
            pushAllLeft(rn.right, stack); 
        }
    }

    public static TreeNode rightMostNode(TreeNode node, TreeNode curr) {
        while(node.right != null && node.right != curr) node = node.right;
        return node;
    }

    public static List<Integer> morris_traversal(TreeNode node) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = node;
        while(curr != null) {
            TreeNode left = curr.left;
            if(left == null) {
                ans.add(curr.val);
                curr = curr.right;
            }
            else {
                TreeNode rmn = rightMostNode(left, curr);
                if(rmn.right == null) {
                    rmn.right = curr;
                    curr = curr.left;
                }
                else {
                    rmn.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return ans;
    }
}