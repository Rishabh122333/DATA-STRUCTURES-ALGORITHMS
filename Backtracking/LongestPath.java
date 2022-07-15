public class LongestPath {
    public static int path(int maze[][], int i, int j,int step, int max)
    {
        if(i==maze.length-1 && j==maze[0].length-1)
        {
            if(max<step)
                max=step;
            return max;
        }
        if(maze[i][j]==0)
            return max;
        maze[i][j]=0;
        if(i<maze.length-1)
            max= path(maze, i+1, j, step+1, max);
        if (j < maze[0].length - 1) {
            max=  path(maze, i, j+1, step+1, max);
        }

        if (i > 0) {
            max= path(maze, i-1, j, step+1, max);
        }

        if (j > 0) {
            max= path(maze, i, j-1, step+1, max);
        }
        maze[i][j]=1;
        return max;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
        System.out.println(path(maze,0,0,1,0));
    }
}
