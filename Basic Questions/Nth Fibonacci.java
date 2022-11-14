import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(fibonacci(n));
}
public static int fibonacci(int n)
{
	int a=0,b=1,c=0;
	if(n==1)
		return 0;
	if(n==2)
		return 1;
	for(int i = 2;i<=n;i++)
	{
		c=a+b;
		a=b;
		b=c;
	}
	return c;
}
}
