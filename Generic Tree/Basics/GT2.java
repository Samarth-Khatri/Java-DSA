import java.util.*;

public class Main {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>(); // List of Children

        Node(int data) {
            this.data = data;
        } 
    }

    public static void levelOrderLine(Node root) { // Display Tree -> Level & Order Linewise
        Queue<Node> queue = new ArrayDeque<>();
        Queue<Node> cqueue = new ArrayDeque<>();
        queue.add(root);

        while(queue.size()>0) {
            // remove -> print -> Add children to child queue
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for(Node child : temp.children)
                cqueue.add(child);
            
            if(queue.size()==0) { // if queue is empty assign cqueue to queue and make cqueue empty
                queue = cqueue;
                cqueue = new ArrayDeque<>();
                System.out.println(".");
            }
        }
    }

    public static Node construct(int []arr) {
        Stack<Node> stack = new Stack<Node>(); // stack of Nodes
        int i=0;
        while(i<arr.length-1) { 
            if(arr[i]==-1) { // If we encounter -1 in array
                Node temp = stack.pop(); // remove current Node
                Node temp2 = stack.peek(); 
                temp2.children.add(temp); // Make current Node a child of Node at Stack top
            }
            else {
                Node temp = new Node(arr[i]);  
                stack.push(temp); // Add Nodes to Stack
            }
            i++;
        }

        return stack.pop(); // Last Node in Stack is Root Node
    }

    // To convert tree into arraylist
    public static void serialize(Node node, ArrayList<Integer> list) {
        list.add(node.data); // pre area
        for(Node child : node.children) 
            serialize(child,list); // recursive call 
        list.add(-1); // post are
    }

    public static void main(String[] args) {
        int []arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1}; // Given Array
        Node root = construct(arr); // Construct Tree from given Array

        ArrayList<Integer> list = new ArrayList<>();
        serialize(root,list); // Serialize Tree to ArrayList
        System.out.println(list);

        levelOrderLine(root); // Display Tree
    }
}