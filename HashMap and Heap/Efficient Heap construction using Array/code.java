import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public myPriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      data.add(val);
      upheapify(data.size()-1);
    }

    public void upheapify(int i) {
      if(i == 0)
        return;
      int pi = (i-1)/2;
      if(data.get(pi) > data.get(i)) {
        swap(pi,i);
        upheapify(pi);
      }
    }

    public void swap(int i, int j) {
      int ith = data.get(i);
      int jth = data.get(j);
      data.set(i, jth);
      data.set(j, ith);
    }

    public int remove() {
      if(data.size() == 0) {
        System.out.println("Underflow");
        return -1;
      }
      swap(0, data.size()-1); // swaping first and last
      int val = data.remove(data.size()-1);
      downheapify(0);
      return val;
    }

    public void downheapify(int i) {
      int min = i;
      
      int lci = 2*i+1;
      if(lci < data.size() && data.get(lci) < data.get(min))
        min = lci;
      
      int rci = 2*i+2;
      if(rci < data.size() && data.get(rci) < data.get(min))
        min = rci;

      if(min!=i) {
        swap(i,min);
        downheapify(min);
      }
    }

    public int peek() {
      if(data.size() == 0) {
        System.out.println("Underflow");
        return -1;
      }
      return data.get(0);
    }

    public int size() {
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    
  }
}