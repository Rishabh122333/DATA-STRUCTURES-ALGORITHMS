import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
print(n);
}
public static void print(int n)
{
	int e=0,o=0,c=0;
	while(n!=0)
	{
		if(c%2==0)
			e+=n%10;
		else
			o+=n%10;
		n/=10;
		c++;

	}
	System.out.println(e);
	System.out.println(o);
}
}
