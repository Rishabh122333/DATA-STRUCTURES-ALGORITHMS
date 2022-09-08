import java.util.*;
public class Main {
    public static void main(String args[]) {
		 Scanner sc =new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t-->0)
		 {
		int n=sc.nextInt();
		int s=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(search(arr,n,s));
    }
	}
	static boolean isPossible(int arr[], int n, int m, int page)
    {
       int s = 1;
       int sum = 0;
       for(int i=0;i<n;i++)
       {
          sum += arr[i];  
          if(sum > page)
           {                          
               s++ ;   
               sum = arr[i] ;    
           }
       }
       return s <= m;
    }
	static int search(int arr[], int n, int m)
    {
        int sum = 0;
        if (n < m) 
			 return -1;
        for (int i = 0; i < n; i++) 
			 sum += arr[i];
        int start = arr[n-1], end = sum,ans=0;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (isPossible(arr, n, m, mid))
            {
                ans = mid;
                end = mid - 1;
            }
      
            else
                start = mid + 1;
        }
        return ans;
    }
}
