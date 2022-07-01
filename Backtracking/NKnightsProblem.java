public class NKnightsProblem {
    public static void knight(boolean[][] maze, int i, int j, int target) {
        if (target == 0) {
            display(maze);
            System.out.println();
            return;
        }

        if (i == maze.length - 1 && j == maze.length) {
            return;
        }

        if (j == maze.length) {
            knight(maze, i + 1, 0, target);
            return;
        }

        if (isSafe(maze, i, j)) {
            maze[i][j] = true;
            knight(maze, i, j + 1, target - 1);
            maze[i][j] = false;
        }
        knight(maze, i, j + 1, target);
    }
    public static void display(boolean maze[][])
    {
        for (boolean i[]: maze) {
            for (boolean j:i) {
                if(j)
                    System.out.print("K ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(boolean maze[][],int i,int j)
    {
        if(isValid(maze, i-1, j-2)) {
            if (maze[i - 1][j - 2])
                return false;
        }
        if(isValid(maze, i-2, j-1)) {
            if (maze[i - 2][j - 1])
                return false;
        }
        if(isValid(maze, i-2, j+1)) {
            if (maze[i - 2][j+1])
                return false;
        }
        if(isValid(maze, i-1, j+2)) {
            if (maze[i - 1][j + 2])
                return false;
        }
            return true;
    }
    public static boolean isValid(boolean maze[][],int i,int j)
    {
        return i>=0 && i< maze.length && j>=0 && j< maze.length;
    }
    public static void main(String[] args) {
        int n=4;
        boolean maze[][]=new boolean[n][n];
        knight(maze,0,0,n);
    }
}
