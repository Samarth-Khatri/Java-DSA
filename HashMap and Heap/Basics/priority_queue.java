import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) {

    // Add in Queue -> O(logN)
    // Remove from Queue -> O(logN)
    // Peek in Queue -> O(1)

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(50);
    pq.add(30);
    pq.add(40);
    pq.add(20);
    pq.add(10);

    System.out.println(pq.peek()); // 50,30,40,20,10 -> 10
    pq.remove(); // 10

    System.out.println(pq.remove()); // 50,30,40,20 -> 20

    System.out.println(pq.remove()); // 50,30,40 -> 30

    System.out.println(pq.remove()); // 50,40 -> 40

    System.out.println(pq.remove()); // 50 -> 50

    // We can use it for sorting in NlogN Tc
    PriorityQueue<Integer> spq = new PriorityQueue<>();
    int []arr = {2,45,62,32,11,78,99,126,42,86,91,999};
    
    for(int val : arr) // N
        spq.add(val); // logN

    while(spq.size()>0)
        System.out.print(spq.remove() + " "); // logN

    
    // If we want to give priority to bigger number than   
    PriorityQueue<Integer> spq = new PriorityQueue<>(Collections.reverseOrder()); // Reverse sorting
    int []arr = {2,45,62,32,11,78,99,126,42,86,91,999};
    
    for(int val : arr) // N
        spq.add(val); // logN

    while(spq.size()>0)
        System.out.print(spq.remove() + " "); // logN
  }
}