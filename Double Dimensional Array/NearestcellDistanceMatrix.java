public class NearestcellDistanceMatrix {
    public static int [][] findnearestcell(int arr[][])
    {
        int ans[][]=new int[arr.length][arr[0].length];
        for (int i = 0; i < ans.length; i++)
        {
            for (int j = 0; j < ans[0].length; j++)
                ans[i][j]=Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l < arr[0].length; l++) {
                        if(arr[k][l]==1)
                        {
                            ans[i][j]=Math.min(ans[i][j],(Math.abs(i-k)+Math.abs(j-l)));
                        }
                    }
                }
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
