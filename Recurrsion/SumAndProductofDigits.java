public class SumAndProductofDigits {
    public static int sum(int n)
    {
        if(n==0)
            return 0;
        return n%10+sum(n/10);
    }
    public static int product(int n)
    {
        if(n%10==n)
            return n;
        return n%10*product(n/10);
    }


    public static void main(String[] args) {
        System.out.println("Sum of digits= "+sum(12345));
        System.out.println("Product of digits= "+product(2345));
    }
}
