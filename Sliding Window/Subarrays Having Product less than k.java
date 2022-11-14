import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int p=1,ei=0,si=0,ans=0;
        while(ei<n)
        {
            p*=arr[ei];
            while(p>=k)
            {
                p/=arr[si++];
            }
            ans+=ei-si+1;
            ei++;
        }
        System.out.println(ans);
    }
}
