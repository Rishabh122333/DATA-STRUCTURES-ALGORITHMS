import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		char temp=str.charAt(0);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=temp)
			{
				s+=temp;
				temp=ch;
			}
		}
		System.out.println(s+temp);
    }
}
