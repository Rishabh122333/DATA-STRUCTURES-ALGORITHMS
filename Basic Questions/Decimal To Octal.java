import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(convert(n));
    }
	public static int convert(int n)
	{
		int c=1,ans=0;
		while(n!=0)
		{
			ans+=c*(n%8);
			c*=10;
			n/=8;
		}
		return ans;
	}
}
