import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1,ans=0;
		while(n!=0)
		{
			int d=n%10;
			ans+=c++*Math.pow(10,d-1);
			n/=10;
		}
		System.out.println(ans);
    }
}
