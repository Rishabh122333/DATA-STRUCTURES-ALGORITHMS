import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int c=0;
        char temp=str.charAt(0);
        String ans="";
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(ch==temp)
            {
                c++;
            }
            else
            {
                ans=ans+temp+c;
                temp=ch;
                c=1;
            }
        }
        char ch=str.charAt(n-1);
        ans=ans+ch+c;
        System.out.println(ans);
    }
}
