import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(armstrong(n));
    }
	public static boolean armstrong(int n)
	{
		int a=n,ans=0;
		int c=(int)Math.log10(n)+1;
		while(a!=0)
		{
			ans+=(int)Math.pow((a%10),c);
			a/=10;
		}
		return ans==n;

	}
}
