import java.util.*;
public class Main {
    public static void main (String args[]) {

    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	pattern(n);
}
public static void pattern(int n)
{
	int a=1,b=1,c=0;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==1)
				System.out.print("0 ");
			else if(i==2)
				System.out.print("1 ");
			else
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print(c +" ");
			}
		}
		System.out.println();
		
	}
}
}
