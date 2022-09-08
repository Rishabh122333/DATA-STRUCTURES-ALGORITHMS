import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			int x=sc.nextInt();
			arr=calculate(arr,x);
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum%((int)Math.pow(10,9)+7));
}
public static int[] calculate(int arr[],int x)
{
	int n=arr.length;
	int []ans=new int[n];
	for(int i=0;i<n;i++)
	{
		if((i-x)<0)
			ans[i]=arr[i]+arr[n+i-x];
		else
			ans[i]=arr[i]+arr[i-x];
	}
	return ans;
}
}
