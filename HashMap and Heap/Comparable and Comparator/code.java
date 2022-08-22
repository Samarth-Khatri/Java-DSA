import java.io.*;
import java.util.*;

public class Main {

  // Custom Made PQ
  public static class MyPriorityQueue<T> { 
    ArrayList<T> data;
    Comparator cmptr;

    public MyPriorityQueue() { 
      data = new ArrayList<>();
      cmptr = null;
    }

    public MyPriorityQueue(Comparator cmptr) { 
      data = new ArrayList<>();
      this.cmptr = cmptr;
    }

    public void add(T val) {
      data.add(val);
      upheapify(data.size()-1);
    }

    public void upheapify(int i) {
      if(i == 0)
        return;
      int pi = i/2 - 1;
      if(isSmaller(i,pi)) {
        swap(pi,i);
        upheapify(pi);
      }
    }

    public void swap(int i, int j) {
      T ith = data.get(i);
      T jth = data.get(j);
      data.set(i, jth);
      data.set(j, ith);
    }

    public T remove() {
      if(data.size() == 0) {
        System.out.println("Underflow");
        return null;
      }
      swap(0, data.size()-1);
      T val = data.remove(data.size()-1);
      downheapify(0);
      return val;
    }

    public void downheapify(int i) {
      int min = i;
      
      int lci = 2*i+1;
      if(lci < data.size() && isSmaller(lci,min))
        min = lci;
      
      int rci = 2*i+2;
      if(rci < data.size() && isSmaller(rci,min))
        min = rci;

      if(min!=i) {
        swap(i,min);
        downheapify(min);
      }
    }

    public T peek() {
      if(data.size() == 0) {
        System.out.println("Underflow");
        return null;
      }
      return data.get(0);
    }

    public int size() {
      return data.size();
    }

    boolean isSmaller(int i, int j) {
      T ith = data.get(i);
      T jth = data.get(j);
      
      if(cmptr != null) {
        if(cmptr.compare(ith,jth) < 0)
          return true;
        else return false;
      } 
     
      else {
        Comparable cith = (Comparable)ith; // typecasting Comparable
        Comparable cjth = (Comparable)jth;
        if(cith.compareTo(cjth) < 0)
          return true;
        else return false;
      }
    }
  }

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
      return this.name.compareTo(other.name); // lexographically ordered
    }
  }

  static class StudentHeightComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
      return s1.ht - s2.ht;
    }
  }

  static class StudentWeightComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
      return s1.wt - s2.wt;
    }
  }

  static class StudentMarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
      return s1.marks - s2.marks;
    }
  }

  public static void main(String[] args) throws Exception {
    // Student s1 = new Student("Sam",170,78);
    // System.out.println(s1);

    Student []students = new Student[5];
    students[0] = new Student("Amit",150,45,90);
    students[1] = new Student("Abba",160,65,99);
    students[2] = new Student("Akansha",170,80,33);
    students[3] = new Student("Abhi",172,75,75);
    students[4] = new Student("Amrit",165,55,28);

    // Inbuilt PQ
    // PriorityQueue<Student> pqName = new PriorityQueue<>();
    // PriorityQueue<Student> pqHt = new PriorityQueue<>(new StudentHeightComparator());
    // PriorityQueue<Student> pqWt = new PriorityQueue<>(new StudentWeightComparator());
    // PriorityQueue<Student> pqMarks = new PriorityQueue<>(new StudentMarksComparator());

    // Custom PQ
    MyPriorityQueue<Student> pqName = new MyPriorityQueue<>();
    MyPriorityQueue<Student> pqHt = new MyPriorityQueue<>(new StudentHeightComparator());
    MyPriorityQueue<Student> pqWt = new MyPriorityQueue<>(new StudentWeightComparator());
    MyPriorityQueue<Student> pqMarks = new MyPriorityQueue<>(new StudentMarksComparator());
    
    for(Student student : students) {
      pqName.add(student);
      pqHt.add(student);
      pqWt.add(student);
      pqMarks.add(student);
    }

    System.out.println("On The Basis of Name");
    while(pqName.size()>0)
      System.out.println(pqName.remove());

    System.out.println();
    System.out.println("On The Basis of Height");
    while(pqHt.size()>0)
      System.out.println(pqHt.remove());

    System.out.println();
    System.out.println("On The Basis of Weight");
    while(pqWt.size()>0)
      System.out.println(pqWt.remove());

    System.out.println();
    System.out.println("On The Basis of Marks");
    while(pqMarks.size()>0)
      System.out.println(pqMarks.remove());
  }
}