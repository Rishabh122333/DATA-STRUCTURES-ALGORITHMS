import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(convert(n));
    }
	public static int convert(int n)
	{
		int c=0,ans=0;
		while(n!=0)
		{
			ans+=(n%10)*(int)Math.pow(2,c++);
			n/=10;
		}
		return ans;
	}
}
