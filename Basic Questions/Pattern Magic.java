import java.util.*;
public class Main {
    public static void main (String args[]) {

    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	pattern(n);
}
public static void pattern(int n)
{
	int s=-3,col=n+1;
	for(int i=1;i<2*n;i++)
	{
	    if(i>n)
		{
		    col++;
		    s-=2;
		}
		else 
		{
		    col--;
		    s+=2;
		}
		for(int j=1;j<=col;j++)
		{
			System.out.print("*");
		}
	    for(int j=1;j<=s;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=(2*n-Math.abs(s))/2;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
