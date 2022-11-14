import java.util.*;
public class Main {
    public static void main (String args[]) {

    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	pattern(n);
}
public static void pattern(int n)
{
	int s=n-1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=s;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=n;j++)
		{
			if(i==1 || i==n)
				System.out.print("*");
			else if(j==1 || j==5)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		s--;
		System.out.println();
	}
}
}
