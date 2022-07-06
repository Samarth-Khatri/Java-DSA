import java.util.*;

public class Main {

  public static void main(String[] args) {
    
    Queue<Integer> queue = new ArrayDeque<>(); // queue define -> First In First Out (FIFO)

    // Adding in Queue -> Enqueue -> O(1)
    queue.add(10);
    queue.add(20);
    queue.add(30);
    queue.add(40);

    // Display Queue
    System.out.println(queue); // 10 20 30 40

    // Deleting from Queue -> Dequeue -> O(1)
    queue.remove(); // It gets and deletes element -> 20 30 40
    System.out.println(queue.remove()); // 30 40 and display 20

    // Getting from Queue -> Front -> O(1)
    System.out.println(queue.peek()); // 30 40 and gets 30

    System.out.println(queue); // 30 40
  }
}