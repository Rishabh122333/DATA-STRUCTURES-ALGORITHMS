import java.util.*;
public class Main {
    public static void main (String args[]) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(sqrt(n));
    }
    public static int sqrt(int n)
    {
            if(n==1)
                return 1;
            long beg=1,end=n/2,ans=0;
            while(beg<=end)
            {
                    long mid=beg+(end-beg)/2;
                    if(mid*mid<=n)
                    {
                            ans=mid;
                            beg=mid+1;
                    }
                    else
                        end=mid-1;
            }
            return (int)ans;
    }
}
