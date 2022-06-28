/*  count all the paths from which you can go from point a to point b in the following maze :-

     ________________
     | a  |    |    |
     |____|____|____|
     |    |    |    |
     |____|____|____|
     |    |    | b  |
     |____|____|____|
 */

public class CountPathsofMaze {
    public static int count(int arr[][],int i,int j)
    {
        if(i== arr.length-1 || j==arr[0].length-1)
            return 1;
        int c=0;
        c+=count(arr,i+1,j);
        c+=count(arr,i,j+1);
        return c;
    }

    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        System.out.println(count(arr,0,0));
    }
}
