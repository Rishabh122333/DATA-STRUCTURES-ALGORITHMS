import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		long []arr=new long[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLong();
		}
		System.out.println(subarray(arr));
    	}
	}
	public static long subarray(long arr[])
	{
		long sum=0;
		int n=arr.length;
		long []freq=new long[n];
		freq[0]=1;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			long x=sum%n;
			if(x<0)
				x+=n;
			freq[(int)x]++;
		}
		sum=0;
		for(int i=0;i<n;i++)
		{
			if(freq[i]>=2)
				sum+=freq[i]*(freq[i]-1)/2;
		}
		return sum;
	}
}
