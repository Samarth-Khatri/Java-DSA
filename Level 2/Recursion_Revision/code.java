import java.io.*;
import java.util.*;

public class Main {

  public static void printIncreasing(int a, int b) {
    if (a > b) return;
    System.out.println(a);
    printIncreasing(a + 1, b);
  }

  public static void printDecreasing(int a, int b) {
    if (a > b) return;
    printDecreasing(a + 1, b);
    System.out.println(a);
  }

  public static void printIncreasingDecreasing(int a, int b) {
    if (a > b) return;
    System.out.println(a);
    printIncreasingDecreasing(a + 1, b);
    System.out.println(a);
  }

  public static int fact(int n) {
    return n == 0 ? 1 : fact(n - 1) * n;
  }

  public static int power(int a, int b) {
    return b == 0 ? 1 : power(a, b - 1) * a;
  }

  public static int power_btr(int a, int b) {
    if (b == 0) return 1;
    int ans = power_btr(a, b / 2);
    ans *= ans;
    return ans * (b % 2 == 0 ? 1 : a);
  }

  public static void display(int[] arr, int idx) {
    if (idx == arr.length) return;
    System.out.println(arr[idx]);
    display(arr, idx + 1);
  }

  public static void displayReverse(int[] arr, int idx) {
    if (idx == arr.length) return;
    displayReverse(arr, idx + 1);
    System.out.println(arr[idx]);
  }

  public static int FirstIndex(int[] arr, int idx, int data) {
    if (idx == arr.length) return -1;
    if (arr[idx] == data) return idx;
    return FirstIndex(arr, idx + 1, data);
  }

  public static int LastIndex(int[] arr, int idx, int data) {
    if (idx == arr.length) return -1;
    int ans = LastIndex(arr, idx + 1, data);
    if (ans != -1) return ans;
    return arr[idx] == data ? idx : -1;
  }
}
