import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			long n=sc.nextLong();
			long k=sc.nextLong();
			System.out.println(kthroot(n,k));
		}
    }
	public static long kthroot(long n,long k)
	{
		if(k==1)
			return n;
		if(n==1)
			return n;
		long beg=1,end=n,ans=-1;
		while(beg<=end)
		{
			long mid=beg+(end-beg)/2;
			if((long)Math.pow(mid,k)<=n)
			{
				ans=mid;
				beg=mid+1;
			}
			else 
				end=mid-1;
		}
		return ans;
	}
}
