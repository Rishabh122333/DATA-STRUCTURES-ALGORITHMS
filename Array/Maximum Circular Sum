import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int [n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			System.out.println(calculate(arr));
		}
    }
	public static int calculate(int arr[])
	{
		int sum=0,max=0;
		for(int i=0;i<arr.length;i++)
		{
			int j=i;
			while(true)
			{
				sum+=arr[j];
				if(max<sum)
					max=sum;
				if(sum<0)
					sum=0;
				j=(j+1)%arr.length;
				if(j==i)
					break;
			}
			sum=0;
		}
		return max;
	}
}
