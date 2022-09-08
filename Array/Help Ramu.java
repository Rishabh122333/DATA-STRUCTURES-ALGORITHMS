import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int arr[]=new int[4];
			for(int i=0;i<4;i++)
				arr[i]=sc.nextInt();
			int m=sc.nextInt();
			int n=sc.nextInt();
			int a[]=new int[m];
			for(int i=0;i<m;i++)
				a[i]=sc.nextInt();
			int b[]=new int[n];
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
			System.out.println(calculate(arr,a,b));
		}
    }
	public static int calculate(int arr[],int a[],int b[])
	{
		int cr=0,cc=0,ans=0;
		for(int i=0;i<a.length;i++)
		{
			cr+=Math.min(a[i]*arr[0],arr[1]);
		}
		cr=Math.min(cr,arr[2]);
		for(int i=0;i<b.length;i++)
		{
			cc+=Math.min(b[i]*arr[0],arr[1]);
		}
		cc=Math.min(cc,arr[2]);
		ans=Math.min(cr+cc,arr[3]);
		return ans;
	}
}
