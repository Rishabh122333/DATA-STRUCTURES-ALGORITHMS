import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacle {
    public static List<String> print(int arr[][],boolean maze[][], int i, int j, String ans)
    {
        if(maze[i][j]==false)
        {
            List<String>list=new ArrayList<>();
            return list;
        }
        if(i== arr.length-1 && j==arr[0].length-1) {
            List<String>list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        List<String>list=new ArrayList<>();
        if(i<arr.length-1)
        {
            list.addAll(print(arr,maze,i+1,j,ans+'R'));
        }
        if(j<arr[0].length-1)
        {
            list.addAll(print(arr,maze,i,j+1,ans+'D'));
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        boolean maze[][]={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(print(arr,maze,0,0,new String()));
    }
}
