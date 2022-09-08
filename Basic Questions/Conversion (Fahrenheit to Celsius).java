import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
    Scanner sc=new Scanner(System.in);
	int f1=sc.nextInt();
	int f2=sc.nextInt();
	int s=sc.nextInt();
	convert(f1,f2,s);
}
public static void convert(int f1,int f2 ,int s)
{
	for(int i=f1;i<=f2;i+=s)
	{
		int c=(int)(5*(i-32)/9);
		System.out.println(i+" "+c);
	}
}
}
