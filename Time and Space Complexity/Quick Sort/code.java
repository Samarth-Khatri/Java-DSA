import java.io.*;
import java.util.*;

public class Main {

  // Time Complexity -> Average Case -> O(NlogN) -> Equation -> T(N) = KN + T(N/2) + T(N/2)
  // Time Complexity -> Worst Case -> O(N^2)

  public static void quickSort(int[] arr, int lo, int hi) {
    if(lo>hi) // base case
      return;
    int pivot = arr[hi];
    int pidx = partition(arr,pivot,lo,hi); // pidx at correct position
    quickSort(arr,lo,pidx-1); // sorting 0 to pidx-1
    quickSort(arr,pidx+1,hi); // sorting pidx+1 to arr.length-1
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) {
    System.out.println("pivot -> " + pivot);
    int i = lo, j = lo;
    while (i <= hi) {
      if (arr[i] <= pivot) {
        swap(arr, i, j);
        i++;
        j++;
      } else {
        i++;
      }
    }
    System.out.println("pivot index -> " + (j - 1));
    return (j - 1);
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    quickSort(arr, 0, arr.length - 1);
    print(arr);
  }

}