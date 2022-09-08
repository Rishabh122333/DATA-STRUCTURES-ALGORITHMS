import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int q=sc.nextInt();
		while(q-->0)
		{
			int a=sc.nextInt();
			int k=sc.nextInt();
			check(arr,a,k);
		}
    }
	public static void check(int arr[],int a,int k)
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(a%arr[i]==0)
				c++;
		}
		if(c>=k)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
