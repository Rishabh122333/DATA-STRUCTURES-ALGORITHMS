import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sb=sc.nextInt();
		int db=sc.nextInt();
		int sn=sc.nextInt();
		if(sn<=1000000000)
		{
		if(db==10)
			System.out.println(decimal(sb,sn));
		else if(sb==10)
			System.out.println(convert(db,sn));
		else
		{
			int n=decimal(sb,sn);
			System.out.println(convert(db,n));
		}
		}
    }
	public static int decimal(int sb,int sn)
	{
		int c=0,ans=0;
		while(sn!=0)
		{
			ans+=(sn%10)*(int)Math.pow(sb,c++);
			sn/=10;
		}
		return ans;
	}
	public static int convert(int db,int n)
	{
		int c=1,ans=0;
		while(n!=0)
		{
			ans+=c*(n%db);
			c*=10;
			n/=db;
		}
		return ans;
	}
}
