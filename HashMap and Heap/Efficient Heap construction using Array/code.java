import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    // Time Complexity -> O(N)
    public PriorityQueue(int []arr) { // input array
      data = new ArrayList<>();
      for(int i:arr) // add array elements to data list
        data.add(i);
      
      for(int i=data.size()/2-1;i>=0;--i) // call down heapify (more elements do less work)
        downheapify(i);
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
    int []arr = {5,53,30,76,45,1,98,69};
    PriorityQueue pq = new PriorityQueue(arr);
    while(pq.size()>0)
      System.out.println(pq.remove() + " ");
  }
}