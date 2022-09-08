import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			calculate(arr);
		}
    }
	public static void calculate(int arr[])
	{
		int i=arr.length-2;
		while(i>=0 && arr[i+1]<=arr[i])
		{
			i--;
		}
		if(i>=0)
		{
		int j=arr.length-1;
		while(arr[j]<=arr[i])
		{
			j--;
		}
		swap(arr,i,j);
		}
		reverse(arr,i+1);
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void reverse(int arr[],int i)
	{
		int j=arr.length-1;
		while(i<j)
		{
			swap(arr,i,j);
			i++;
			j--;
		}
	}
}
