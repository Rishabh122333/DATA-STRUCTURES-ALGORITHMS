import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
print(a,b);
}
public static void print(int a, int b)
{
	int c=1,i=1;
	while(c<=a)
	{
		int s=3*i+2;
		if(s%b!=0)
		{
			System.out.println(s);
			c++;
		}
		i++;
	}
}
}
