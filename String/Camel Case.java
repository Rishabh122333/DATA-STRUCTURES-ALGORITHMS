import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int pos=-1,pos1=-1;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((Character.isUpperCase(ch)))
			{
				if(pos==-1)
					pos=i;
				else
					pos1=i;
			}
			if(pos!=-1 && pos1!=-1)
			{
				System.out.println(str.substring(pos,pos1));
				pos=i;
				pos1=-1;
			}
			if(i==str.length()-1)
			{
				System.out.println(str.substring(pos));
			}
		}
    }
}
