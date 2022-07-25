import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) {
    // Define HashMap
    HashMap<String, Integer> pmap = new HashMap<>();

    // Add
    pmap.put("India", 130);
    pmap.put("China", 200);
    pmap.put("US", 100);
    pmap.put("Utopia", 0);

    // Print
    System.out.println(pmap);

    // Update 
    pmap.put("US", 50);
    System.out.println(pmap);

    // Get
    int ipop = pmap.get("India"); // bad practice
    System.out.println(ipop);
  
    // Use Integer
    Integer uspop = pmap.get("US"); // bad practice
    Integer xyzpop = pmap.get("xyz");
    System.out.println(uspop);
    System.out.println(xyzpop); // returns null if key not present

    System.out.println(pmap.containsKey("xyz")); // false
    pmap.put("xyz", 1000);
    System.out.println(pmap.containsKey("xyz")); // true

    // Get all Keys
    Set<String> keys = pmap.keySet(); // used to get keys (random order)
    for(String key : keys) {
      System.out.print(key + " -> ");
      System.out.println(pmap.get(key));
    } 
  }
}