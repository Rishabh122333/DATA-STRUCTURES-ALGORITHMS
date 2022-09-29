public class towerofhanoi {
    public static void main(String[] args) {
        int n=3;
        solve(n, "A", "B", "C");
    }
    public static void solve(int n,String source,String help,String dest)
    {
        if(n==0)
            return;
        solve(n-1, source, dest, help);
        System.out.println("Move "+n+" th disc from "+source+" to "+dest);
        solve(n-1,help, source, dest);

    }
}
