import java.util.*;
public class Main {
    public static void main(String args[]) {
		 Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(search(arr,c));
    }
	public static int search(int arr[],int cow)
	{
		int beg=1,end=arr[arr.length-1]-arr[0],ans=-1;
		while(beg<=end)
		{
			int mid=beg+(end-beg)/2;
			if(canplace(arr,cow,mid))
			{
				ans=mid;
				beg=mid+1;
			}
			else 
				end=mid-1;
		}
		return ans;
	}
	public static boolean canplace(int arr[],int cow,int dist)
	{
		int c=1,start=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-start>=dist)
			{
				start=arr[i];
				c++;
			}
			if(c==cow)
				return true;
		}
		return false;
	}
}
