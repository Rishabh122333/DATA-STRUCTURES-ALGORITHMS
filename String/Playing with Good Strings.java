import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int ans=0,c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
				c++;
			else
				c--;
			if(c<0)
				c=0;
			ans=Math.max(ans,c);
		}
		System.out.println(ans);
    }
}
