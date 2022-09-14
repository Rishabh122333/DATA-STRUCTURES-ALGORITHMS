import java.util.*;
public class Main {
    public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	String str=sc.next();
	int a=calculate(k,str,'a');
	int b=calculate(k,str,'b');
	System.out.println(Math.max(a,b));
    }
	public static int calculate(int k, String str,char ch)
	{
		int si=0,ei=0,ans=0,flip=0;
		while(ei<str.length())
		{
			if(str.charAt(ei)==ch)
				flip++;
			while(flip>k)
			{
				if(str.charAt(si)==ch)
					flip--;
				si++;
			}
			ans=Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}
}
