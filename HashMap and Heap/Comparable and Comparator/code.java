import java.io.*;
import java.util.*;

public class Main {

  // Custom Made PQ
  // public static class PriorityQueue {
  //   ArrayList<Integer> data;

  //   public PriorityQueue() { 
  //     data = new ArrayList<>();
  //   }

  //   public void add(int val) {
  //     data.add(val);
  //     upheapify(data.size()-1);
  //   }

  //   public void upheapify(int i) {
  //     if(i == 0)
  //       return;
  //     int pi = (i-1)/2;
  //     if(data.get(pi) > data.get(i)) {
  //       swap(pi,i);
  //       upheapify(pi);
  //     }
  //   }

  //   public void swap(int i, int j) {
  //     int ith = data.get(i);
  //     int jth = data.get(j);
  //     data.set(i, jth);
  //     data.set(j, ith);
  //   }

  //   public int remove() {
  //     if(data.size() == 0) {
  //       System.out.println("Underflow");
  //       return -1;
  //     }
  //     swap(0, data.size()-1);
  //     int val = data.remove(data.size()-1);
  //     downheapify(0);
  //     return val;
  //   }

  //   public void downheapify(int i) {
  //     int min = i;
      
  //     int lci = 2*i+1;
  //     if(lci < data.size() && data.get(lci) < data.get(min))
  //       min = lci;
      
  //     int rci = 2*i+2;
  //     if(rci < data.size() && data.get(rci) < data.get(min))
  //       min = rci;

  //     if(min!=i) {
  //       swap(i,min);
  //       downheapify(min);
  //     }
  //   }

  //   public int peek() {
  //     if(data.size() == 0) {
  //       System.out.println("Underflow");
  //       return -1;
  //     }
  //     return data.get(0);
  //   }

  //   public int size() {
  //     return data.size();
  //   }
  // }

  public static class Student implements Comparable<Student> {
    String name;
    int ht; // height
    int wt; // weight
    int marks; // marks

    Student(String name, int ht, int wt, int marks) {
      this.name = name;
      this.ht = ht;
      this.wt = wt;
      this.marks = marks;
    }

    public String toString() {
      return this.name + " -> " + this.ht + "," + this.wt + "," + this.marks;
    }

    public int compareTo(Student other) {
      return this.ht - other.ht; // priortizing on height
    }
  }

  public static void main(String[] args) throws Exception {
    // Student s1 = new Student("Sam",170,78);
    // System.out.println(s1);

    Student []students = new Student[5];
    students[0] = new Student("A",150,45,90);
    students[1] = new Student("B",160,65,99);
    students[2] = new Student("C",170,80,33);
    students[3] = new Student("D",172,75,75);
    students[4] = new Student("E",165,55,28);

    PriorityQueue<Student> pqHt = new PriorityQueue<>();
    PriorityQueue<Student> pqWt = new PriorityQueue<>();
    PriorityQueue<Student> pqMarks = new PriorityQueue<>();
    
    for(Student student : students)
      pqHt.add(student);
      pqWt.add(student);
      pqMarks.add(student);

    System.out.println("On The Basis of Height");
    while(pqHt.size()>0)
      System.out.println(pqHt.remove());

    System.out.println("On The Basis of Weight");
    while(pqWt.size()>0)
      System.out.println(pqWt.remove());

    System.out.println("On The Basis of Marks");
    while(pqMarks.size()>0)
      System.out.println(pqMarks.remove());
  }
}