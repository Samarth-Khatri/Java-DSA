import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if(n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}