public class primesieve {
    
    public static void main(String[] args) {
        int n=30;
        check(n);
    }

    public static void check(int n) {

        boolean arr[]=new boolean[n+1];
        arr[0]=true;
        arr[1]=true;
        for (int i = 2; i <=Math.sqrt(n); i++) {

            if(arr[i]==false)
            {
                for (int j = 2; j*i <=n; j++) {
                    arr[i*j]=true;
                }
            }            
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==false)
                System.out.print(i+" ");
        }
    }
}
