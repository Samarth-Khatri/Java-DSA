import java.util.*;

public class Main {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>(); // List of Children

        Node(int data) {
            this.data = data;
        } 
    }

    public static void levelOrder(Node root) { // Display Tree -> Level & Order 
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while(queue.size()>0) {
            // remove -> print -> Add children
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for(Node child : temp.children)
                queue.add(child);
        }
        System.out.println(".");
    }

    public static void main(String[] args) {
        Node root = new Node(10); // Root Node

        Node twenty = new Node(20); // New Node
        root.children.add(twenty); // Adding Children

        Node thirty = new Node(30);
        root.children.add(thirty);

        Node fourty = new Node(40);
        root.children.add(fourty);

        Node fifty = new Node(50);
        twenty.children.add(fifty);

        Node sixty = new Node(60);
        twenty.children.add(sixty);

        Node seventy = new Node(70);
        thirty.children.add(seventy);

        Node eighty = new Node(80);
        thirty.children.add(eighty);

        Node ninety = new Node(90);
        thirty.children.add(ninety);

        Node hundred = new Node(100);
        fourty.children.add(hundred);

        Node oneten = new Node(110);
        eighty.children.add(oneten);

        Node onetwenty = new Node(120);
        eighty.children.add(onetwenty);

        levelOrder(root); // Display Tree
    }
}