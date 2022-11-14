public class maximumsumwindow {
    public static void main(String[] args) {
        int [] arr={1,2,7,5,11,3,2,1};
        int k=3;
        System.out.println(sum(arr,k));
    }
    public static int sum(int []arr,int k)
    {
        int ans=0,max=0;
        for (int i = 0; i < k; i++) {
            ans+=arr[i];
        }
        max=ans;
        for (int i = k; i < arr.length; i++) {
            ans+=arr[i];
            ans-=arr[i-k];
            max=Math.max(max, ans);

        }

        return max;
    }
}
