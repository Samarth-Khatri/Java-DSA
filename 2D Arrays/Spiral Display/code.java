import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r=scn.nextInt();
        int c=scn.nextInt();
        int [][]a = new int[r][c];
        for(int i=0;i<r;++i) {
            for(int j=0;j<c;++j) {
                a[i][j]=scn.nextInt();
            }
        }
        int minr=0, minc=0, cnt=1;
        int maxr=a.length-1;
        int maxc=a[0].length-1;
        int total=r*c;

        while(total>=cnt) {

            //left wall going downwards [column is minc, row varies from minr to maxr]
            for(int i=minr,j=minc; i<=maxr && total>=cnt; i++) {
                System.out.println(a[i][j]);
                cnt++;
            }
            minc++;

            //bottom wall going right [row is maxr, column varies from minc to maxc]
            for(int i=maxr,j=minc; j<=maxc && total>=cnt; j++) {
                System.out.println(a[i][j]);
                cnt++;
            }
            maxr--;

            //right wall going upwards [column is maxc, row varies from maxr to minr]
            for(int i=maxr,j=maxc; i>=minr && total>=cnt; i--) {
                System.out.println(a[i][j]);
                cnt++;
            }
            maxc--;

            //top wall going left [row is minr, column varies from maxc to minc]
            for(int i=minr,j=maxc; j>=minc && total>=cnt; j--) {
                System.out.println(a[i][j]);
                cnt++;
            }
            minr++;
        }
 }

}
