 /*  print all the paths from which you can go from point a to point b in the following maze :-

     ________________
     | a  |    |    |
     |____|____|____|
     |    |    |    |
     |____|____|____|
     |    |    | b  |
     |____|____|____|
 */

 import java.util.ArrayList;
 import java.util.List;

 public class PrintPathsofMaze {
        public static List<String> print(int arr[][], int i, int j, String ans)
        {
            if(i== arr.length-1 && j==arr[0].length-1) {
                    List<String>list=new ArrayList<>();
                    list.add(ans);
                    return list;
                }
            List<String>list=new ArrayList<>();
            if(j==arr[0].length-1)
            {
                list.addAll(print(arr,i+1,j,ans+'D'));
            }
            else if(i==arr.length-1)
            {
                list.addAll(print(arr,i,j+1,ans+'R'));
            }
            else
            {
                list.addAll(print(arr,i+1,j,ans+'D'));
                list.addAll(print(arr,i,j+1,ans+'R'));
            }
            return list;
        }

        public static void main(String[] args) {
            int arr[][]=new int [3][3];
            System.out.println(print(arr,0,0,new String()));
        }
 }
