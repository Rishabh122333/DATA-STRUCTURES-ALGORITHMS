import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class NearestcellDistanceMatrix {
    static class matrix_element {
        int row;
        int col;
        matrix_element(int row, int col)
        {
            this.row = row;
            this.col = col;
        }
    }
    public static int [][] findnearestcell(int arr[][])
    {
        int ans[][]=new int[arr.length][arr[0].length];
        Queue<matrix_element> queue=new LinkedList<matrix_element>();
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if(arr[i][j]==1)
                    queue.add(new matrix_element(i,j));
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int min=Integer.MAX_VALUE;
                if(arr[i][j]==0)
                {
                    for(int k=0;k< queue.size();k++)
                    {
                        matrix_element pos= queue.poll();
                        min=Math.min(min,Math.abs(pos.row-i)+Math.abs(pos.col-j));
                        if(min==1)
                        {
                            ans[i][j]=1;
                            queue.add(new matrix_element(pos.row, pos.col));
                            break;
                        }
                        queue.add(new matrix_element(pos.row, pos.col));
                    }
                    ans[i][j]=min;
                }
                else
                    ans[i][j]=0;
                }
            }
        return ans;
    }
    public static void main (String[] args)
    {
        int arr[][] = { {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0} };

        int ans[][]=findnearestcell(arr);
        for (int i = 0; i < ans.length; i++)
        {
            for (int j = 0; j < ans[0].length; j++)
                System.out.print( ans[i][j] + " ");
            System.out.println();
        }
    }
}
