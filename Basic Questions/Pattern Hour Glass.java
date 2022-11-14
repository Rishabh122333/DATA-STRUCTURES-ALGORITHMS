import java.util.*;
public class Main {
    public static void main (String args[]) {

    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	pattern(n);
}
public static void pattern(int n)
{
	int s=-1,col=n+1;
	for(int i=1;i<=2*n+1;i++)
	{
	    if(i>n+1)
		{
		    col++;
		    s--;
		}
		else 
		{
		    col--;
		    s++;
		}
	    for(int j=1;j<=s;j++)
		{
			System.out.print("  ");
		}
		for(int j=col;j>=0;j--)
		{
			System.out.print(j+" ");
		}
		for(int j=1;j<=col;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
