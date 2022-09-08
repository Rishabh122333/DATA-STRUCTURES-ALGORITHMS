import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
	{
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(calculate(arr));
	}
    }
	public static int calculate(int arr[])
	{
		int n=arr.length,max=0,water=0;
		int left[]=new int[n];
		int right[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			left[i]=max;
		}
		max=0;
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]>max)
				max=arr[i];
			right[i]=max;
		}
		for(int i=0;i<n;i++)
		{
			water+=Math.min(left[i],right[i])-arr[i];
		}
		return water;
	}
}
