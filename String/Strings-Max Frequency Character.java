import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ans=str.charAt(0);
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==ans)
				c++;
			else
				c--;
			if(c==0)
			{
			 	ans=ch;
				c++;
			}
		}
		System.out.println(ans);
    }
}
