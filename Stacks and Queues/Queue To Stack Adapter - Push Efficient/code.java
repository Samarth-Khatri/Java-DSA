import java.io.*;
import java.util.*;

public class Main {

  public static class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
    }

    int size() {
      return mainQ.size();
    }

    void push(int val) {
      mainQ.add(val);
    }

    int pop() {
      if(mainQ.isEmpty()) {
        System.out.println("Stack underflow");
        return -1;
      }
      while(mainQ.size() != 1)
        helperQ.add(mainQ.poll());
      int rem = mainQ.poll();
      mainQ = helperQ;
      helperQ = new ArrayDeque<>();
      return rem;
    }

    int top() {
      if(mainQ.isEmpty()) {
        System.out.println("Stack underflow");
        return -1;
      }
      while(mainQ.size() != 1)
        helperQ.add(mainQ.poll());
      int rem = mainQ.poll();
      helperQ.add(rem);
      mainQ = helperQ;
      helperQ = new ArrayDeque<>();
      return rem;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueToStackAdapter st = new QueueToStackAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}