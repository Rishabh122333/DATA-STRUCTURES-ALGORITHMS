public class PalindromeNumber {
    public static int reverse(int n)
    {
        if(n==0)
            return n;
        int c=(int)Math.log10(n)+1;
       return rev(n,c);
    }
    public static int rev(int n,int count)
    {
        if(n%10==n)
            return n;
        return n%10*(int)Math.pow(10,count-1)+rev(n/10,count-1);
    }

    public static void main(String[] args) {
        int n=15151;
        if(n==reverse(n))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
