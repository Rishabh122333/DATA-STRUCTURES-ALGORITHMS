import java.util.*;
public class Main {
    public static void main (String args[]) {

    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	pattern(n);
}
public static void pattern(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(j==1 || j==i)
				System.out.print(i+" ");
			else
				System.out.print("0 ");
		}
		System.out.println();
	}
}
}
