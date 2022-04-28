import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        if(sr==maze.length-1 && sc==maze[0].length-1) {
            System.out.println(asf);
            return;
        }

        if(sc<0 || sc>=maze[0].length || sr<0 || sr>=maze.length || maze[sr][sc]==1)
            return;

        maze[sr][sc] = 1; // Make blockage to restrict prev moves

        floodfill(maze,sr-1,sc,asf+"t"); // Top
        floodfill(maze,sr,sc-1,asf+"l"); // Left
        floodfill(maze,sr+1,sc,asf+"d"); // Down
        floodfill(maze,sr,sc+1,asf+"r"); // Right

        maze[sr][sc] = 0; // Remove blockage after backtracking
    }
}
