import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        printsum(arr,m);
        }
    }
    public static void printsum(int arr[],int target)
    {
        int i=0,j=arr.length-1,min=Integer.MAX_VALUE,a=0,b=0;
        while(i<arr.length)
        {
            if(arr[i]+arr[j]==target)
            {
				if(Math.abs(arr[i]-arr[j])<min)
				{
				min=Math.abs(arr[i]-arr[j]);
					a=arr[i];
					b=arr[j];
				}
                i++;
                j=arr.length-1;
            }
            else
                j--;
             if(i>=j)
            {
                i++;
                j=arr.length-1;
            }
        }
		 if(a<=b)
			System.out.println("Deepak should buy roses whose prices are "+a+" and "+b+".");
	else 
		System.out.println("Deepak should buy roses whose prices are "+b+" and "+a+".");
	}
}
