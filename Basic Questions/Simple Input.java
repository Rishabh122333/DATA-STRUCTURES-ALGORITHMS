import java.util.*;
public class Main {
    public static void main(String args[]) {
		int sum=0;
    Scanner sc=new Scanner(System.in);
	while(true)
	{
	int n=sc.nextInt();
	sum+=n;
	if(sum<0)
		break;
	else
		System.out.println(n);
}
	}
}
