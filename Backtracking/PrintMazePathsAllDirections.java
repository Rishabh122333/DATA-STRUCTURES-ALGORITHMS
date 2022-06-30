/*  print all the paths from which you can go from point a to point b in the following maze :-

    ________________
    | a  |    |    |
    |____|____|____|
    |    |    |    |
    |____|____|____|
    |    |    | b  |
    |____|____|____|
*/

import java.util.Arrays;

public class PrintMazePathsAllDirections {
    public static void print(String ans, boolean maze[][], int i, int j,int arr[][],int step) {
        if (i == maze.length - 1 && j == maze[0].length - 1) {
            arr[i][j] = step;
            System.out.println(ans);
            for (int a[] : arr) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
        return;
    }
        if (maze[i][j]==false) {
            return;
        }
        maze[i][j] = false;
        arr[i][j]=step;
        if (i < maze.length - 1) {
            print(ans + 'D', maze, i+1, j,arr,step+1);
        }

        if (j < maze[0].length - 1) {
            print(ans + 'R', maze, i, j+1,arr,step+1);
        }

        if (i > 0) {
            print(ans + 'U', maze, i-1, j,arr,step+1);
        }

        if (j > 0) {
            print(ans + 'L', maze, i, j-1,arr,step+1);
        }
        arr[i][j]=0;
        maze[i][j] = true;
    }

    public static void main(String[] args) {
        boolean maze[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int arr[][]=new int[maze.length][maze[0].length];
        print(new String(),maze,0,0,arr,1);
    }
}
