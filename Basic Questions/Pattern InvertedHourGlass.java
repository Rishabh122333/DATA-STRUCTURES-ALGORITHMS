import java.util.*;
public class Main {
    public static void main (String args[]) {

    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	pattern(n);
}
public static void pattern(int n)
{
	int s=2*n+1;
	for(int i=1;i<=2*n+1;i++)
	{
	    if(i>n+1)
		{
		    s+=2;
		}
		else 
		{
		    s-=2;
		}
		for(int j=n;j>=Math.abs(n+1-i);j--)
		{
			System.out.print(j+" ");
		}
	    for(int j=1;j<=s;j++)
		{
			System.out.print("  ");
		}
		for(int j=Math.abs(n+1-i);j<=n;j++)
		{
			if(j==0)
				System.out.print("");
			else
				System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
