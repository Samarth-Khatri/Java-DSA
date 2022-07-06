import java.util.*;

public class Main {

  public static void main(String[] args) {
    
    Stack<Integer> stack = new Stack<>(); // defining Stack -> Last In First Out (LIFO)

    // Adding in Stack -> O(1)
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    // Display
    System.out.println(stack); // 10 20 30 40

    // Deleting from Stack -> O(1)
    stack.pop(); // removes and gets the element -> 10 20 30
    System.out.println(stack.pop()); // 10 20 and gives 30

    // Geting from Stack
    System.out.println(stack.peek()); // gives 20

    System.out.println(stack); // 10 20 
  }
}