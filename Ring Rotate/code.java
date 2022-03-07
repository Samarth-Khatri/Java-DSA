import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;++i) {
            for(int j=0;j<m;++j) {
                arr[i][j]=scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        ringRotate(arr,s,r);
        display(arr);
    }

    public static void ringRotate(int [][]arr, int s, int r) {
        int []oned = fillOnedFromShell(arr,s);
        rotate(oned,r);
        fillShellFromOned(arr,s,oned);
    }

    public static int[] fillOnedFromShell(int [][]arr, int s) {
        int minr = s-1;
        int minc = s-1;
        int maxc = arr[0].length-s;
        int maxr = arr.length-s;
        int size = 2*(maxr-minr) + 2*(maxc-minc);
        int []oned = new int[size];
        int idx = 0;

        //left wall
        for(int i=minr,j=minc;i<=maxr;i++) {
            oned[idx] = arr[i][j];
            idx++;
        }

        //bottom wall
        for(int i=maxr,j=minc+1;j<=maxc;j++) {
            oned[idx] = arr[i][j];
            idx++;
        }

        // right wall
        for(int i=maxr-1,j=maxc;i>=minr;i--) {
            oned[idx] = arr[i][j];
            idx++;
        }

        // top wall
        for(int i=minr,j=maxc-1;j>=minc+1;j--) {
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned;
    }

    public static void rotate(int []a, int r) {
        r=r%a.length;
        int i=0;
        if(r<0)
            r+=a.length;
        reverse(a,i,a.length-1);
        reverse(a,i,r-1);
        reverse(a,r,a.length-1);
    }

    public static void reverse(int[] a, int i, int j){
        while(j>i) {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++; j--;
        }
    }

    public static void fillShellFromOned(int [][]arr, int s, int []oned) {
        int minr = s-1;
        int minc = s-1;
        int maxc = arr[0].length-s;
        int maxr = arr.length-s;
        int idx = 0;

        //left wall
        for(int i=minr,j=minc;i<=maxr;i++) {
            arr[i][j] = oned[idx];
            idx++;
        }

        //bottom wall
        for(int i=maxr,j=minc+1;j<=maxc;j++) {
            arr[i][j] = oned[idx];
            idx++;
        }

        // right wall
        for(int i=maxr-1,j=maxc;i>=minr;i--) {
            arr[i][j] = oned[idx];
            idx++;
        }

        // top wall
        for(int i=minr,j=maxc-1;j>=minc+1;j--) {
            arr[i][j] = oned[idx];
            idx++;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
