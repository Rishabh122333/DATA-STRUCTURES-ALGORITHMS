import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println(lcm(m,n));
}
public static int hcf(int m,int n )
{
	if(m==0)
		return n;
	else
		return hcf(n%m,m);
}
public static int lcm(int m, int n)
{
	return (m*n)/hcf(m,n);
}
}
