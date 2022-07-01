public class NQueensProblem {
    public static void queen(boolean maze[][], int i) {
        if (i== maze.length) {
            display(maze);
            System.out.println();
            return;
        }
        for (int j = 0; j < maze.length; j++) {
            if(isSafe(maze,i,j))
            {
                maze[i][j]=true;
                queen(maze,i+1);
                maze[i][j]=false;
            }
        }
    }
    public static void display(boolean maze[][])
    {
        for (boolean i[]: maze) {
            for (boolean j:i) {
                if(j)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(boolean maze[][],int i,int j)
    {
        for (int k = 0; k < i; k++) {
            if(maze[k][j])
                return false;
        }
        int left=Math.min(i,j);
        for (int k = 1; k <=left; k++) {
            if(maze[i-k][j-k])
                return false;
        }
        int right=Math.min(i,maze.length-1-j);
        for (int k = 1; k <=right; k++) {
            if(maze[i-k][j+k])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        boolean maze[][]=new boolean[n][n];
        queen(maze,0);
    }
}
