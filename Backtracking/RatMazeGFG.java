import java.util.Arrays;

public class RatMazeGFG {
    public static void path(int maze[][],int ans[][],int i,int j)
    {
        if(i== maze.length-1 && j== maze[0].length-1)
        {
            ans[i][j]=1;
            for (int a[]:ans) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            return;
        }
        if(j== ans[0].length)
            path(maze,ans,i+1,0);
        if(maze[i][j]==1)
        {
            ans[i][j]=1;
            if(i< maze.length-1)
                path(maze, ans, i+1, j);
            if(j< maze[0].length-1)
                path(maze, ans, i, j+1);
            ans[i][j]=0;
        }
    }

    public static void main(String[] args) {
        int maze[][]={
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1},
        };
        int ans[][]={
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };
        path(maze,ans,0,0);
    }
}
