import java.util.*;
public class Main {
    public static void main(String args[]) {
		 Scanner sc =new Scanner(System.in);
		int p=sc.nextInt();
		int l=sc.nextInt();
		int []arr=new int[l];
		for(int i=0;i<l;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(search(arr,p));
    }
	public static int search(int arr[],int p)
	{
		Arrays.sort(arr);
		int sum=(p/2)*(2*arr[0]+(p-1));
		int beg=0,end=sum,ans=-1;
		while(beg<=end)
		{
			int mid=beg+(end-beg)/2;
			if(calculate(arr,p,mid))
			{
				ans=mid;
				end=mid-1;
			}
			else 
				beg=mid+1;
		}
		return ans;
	}
	public static boolean calculate(int arr[],int p,int time)
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum=0,c=1;
			while(sum+c*arr[i]<=time && p>0)
			{
				sum+=c*arr[i];
				p--;
				c++;
			}
		}
		return p==0;
	}
}
