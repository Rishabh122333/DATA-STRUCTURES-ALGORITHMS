import java.util.*;
public class Main {
    public static void main (String args[]) {

    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	pattern(n);
}
public static void pattern(int n)
{
	for(int i=0;i<n;i++)
	{
		int val=1;
		for(int j=0;j<=i;j++)
		{
			System.out.print(val+" ");
			val=(val*(i-j))/(j+1);
		}
		System.out.println();
	}
}
}
