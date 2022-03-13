import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0;i<n;++i) {
            for(int j=0;j<n;++j) {
                arr[i][j]=scn.nextInt();
            }
        }
        //swap for transpose
        for(int i=0;i<arr.length-1;++i) {
            for(int j=i+1;j<arr.length;++j) {
                arr[i][j]=arr[i][j]+arr[j][i];
                arr[j][i]=arr[i][j]-arr[j][i];
                arr[i][j]=arr[i][j]-arr[j][i];
            }
        }

        // Arranging columns by swapping
        int left=0, right=n-1;
        while(left<right) {
            for(int i=0;i<n;i++) {
                arr[i][left]=arr[i][left]+arr[i][right];
                arr[i][right]=arr[i][left]-arr[i][right];
                arr[i][left]=arr[i][left]-arr[i][right];
            }
            left++;
            right--;
        }

        display(arr,n);
    }

    public static void display(int[][] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
