import java.util.*;
public class Main {
    public static void main(String args[]) {
		 Scanner sc =new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(search(arr,k));
    }
	public static int search(int arr[],int s)
	{
		int sum=0,max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			sum+=arr[i];
		}
		int beg=max,end=sum,ans=-1;
		while(beg<=end)
		{
			int mid=beg+(end-beg)/2;
			if(canpaint(arr,s,mid))
			{
				ans=mid;
				end=mid-1;
			}
			else 
				beg=mid+1;
		}
		return ans;
	}
	public static boolean canpaint(int arr[],int s,int paint)
	{
		int c=1,sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum>paint)
			{
				c++;
				sum=arr[i];
			}
		}
		return c<=s;
	}
}
