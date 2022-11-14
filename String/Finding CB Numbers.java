import java.util.*;
public class Main {
	static int f(int i,String s,long u)
	{
		if(i==s.length())
		{
			if(isprime(u) && u!=0 && u!=1)
			return 1;

			return 0;
		}
		if(u==0)
		return Math.max(f(i+1,s,s.charAt(i)-'0'),f(i+1,s,u));

		if(u==1)
			return Math.max(f(i+1,s,u*10+s.charAt(i)-'0'),f(i+1,s,s.charAt(i)-'0'));

		if(isprime(u))
		{
			return Math.max(f(i+1,s,u*10+s.charAt(i)-'0'),f(i+1,s,s.charAt(i)-'0')+1);
		}
		return Math.max(f(i+1,s,u*10+s.charAt(i)-'0'),f(i+1,s,s.charAt(i)-'0'));
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		long u =0;
		System.out.println(f(0,str,u));
    }
	public static boolean isprime(long n)
	{
		int c=0;
		for(long i=2;i<=(long)Math.sqrt(n);i++)
		{
			if(n%i==0)
			 c++;
		}
		return c==0;
	}
}
