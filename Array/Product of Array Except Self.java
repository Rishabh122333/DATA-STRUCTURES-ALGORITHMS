import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        product(arr);
    }
    public static void product(long arr[])
    {
        long ans[]=new long[arr.length];
        long p=1;
        for(int i=0;i<arr.length;i++)
        {
            p*=arr[i];
            ans[i]=p;
        }
        p=1;
        for(int i=arr.length-1;i>0;i--)
        {
            ans[i]=p*ans[i-1];
            p*=arr[i];
        }
        ans[0]=p;
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
