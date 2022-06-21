public class FabonacciSeries {
    public static int series(int n)
    {
        if(n==1)
            return 0;
        if (n==2)
            return 1;
        return series(n-1)+ series(n-2);
    }

    public static void main(String[] args) {
        System.out.println(series(8));
    }
}
