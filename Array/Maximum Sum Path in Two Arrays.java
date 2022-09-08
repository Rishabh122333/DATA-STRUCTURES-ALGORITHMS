import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			int arr[]=new int [m];
			int arr1[]=new int [n];
			for(int i=0;i<m;i++)
				arr[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				arr1[i]=sc.nextInt();
			System.out.println(calculate(arr,arr1));
		}
    }
	public static int calculate(int arr[],int arr1[])
	{
		int i=0,j=0,sum=0,sum1=0,ans=0;
		while(i<arr.length && j<arr1.length)
		{
			if(arr[i]<arr1[j])
				sum+=arr[i++];
			else if(arr1[j]<arr[i])
				sum1+=arr1[j++];
			else
			{
				ans+=Math.max(sum,sum1)+arr[i];
				sum=0;
				sum1=0;
				i++;
				j++;
			}
		}
		while(i<arr.length)
		{
			ans+=arr[i];
			i++;
		}
		while(j<arr1.length)
		{
			ans+=arr1[j];
			j++;
		}
		return ans;
	}
}
