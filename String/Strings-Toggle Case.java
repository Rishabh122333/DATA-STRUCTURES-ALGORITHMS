import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
				ans=ans+(char)(ch+32);
			else if(ch>=97 && ch<=122)
				ans=ans+(char)(ch-32);
		}
		System.out.println(ans);
    }
}
