import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String str=sc.next();
			int ans=find(str);
			if(ans!=-1)
				System.out.println(str.charAt(ans));
			else
				System.out.println(ans);
		}
    }
	public static int find(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch))
				return i;
		}
		return -1;
	}
}
