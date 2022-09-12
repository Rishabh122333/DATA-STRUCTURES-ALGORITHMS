import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
		 String str=sc.next();
		 int i;
		 if(str.charAt(0)=='9')
		 	i=1;
		 else
		 	i=0;
		while(i<str.length())
		{
			if((str.charAt(i)-48)>=5)
				str=str.substring(0, i)+('9'-str.charAt(i))+str.substring(i+1);
			i++;
		}
		System.out.println(str);
    }
}
