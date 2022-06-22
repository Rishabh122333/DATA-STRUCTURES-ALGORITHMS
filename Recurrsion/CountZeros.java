public class CountZeros {
    public static int countzero(int n)
    {
        if(n==0)
            return 0;
        return count(n,0);
    }
    public static int count(int n,int c)
    {
        if(n==0)
            return c;
        if(n%10==0)
        {
            c++;
            return count(n/10,c);
        }
        return count(n/10,c);
    }

    public static void main(String[] args) {
        int n=10000100;
        System.out.println(countzero(n));
    }
}
