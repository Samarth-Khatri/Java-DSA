import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][]arr = new int[r][c];
        for(int i=0;i<r;++i) {
            for(int j=0;j<c;++j) {
                arr[i][j]=scn.nextInt();
            }
        }
        int i=0, j=0, dir=0;
        while(true) {
            dir = (dir + arr[i][j]) % 4;

            if (dir==0) { // east direction = 0
                j++;
                if(j==arr[0].length) {
                    j--; break;
                }
            } else if(dir==1) { // south direction = 1
                i++;
                if(i==arr.length) {
                    i--; break;
                }
            } else if(dir==2) { // west direction = 2
                j--;
                if(j==-1) {
                    j++; break;
                }
            } else { // north direction = 3
                i--;
                if(i==-1) {
                    i++; break;
                }
            }
        }

        System.out.println(i);
        System.out.println(j);
    }

}
