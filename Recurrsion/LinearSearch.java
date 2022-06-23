public class LinearSearch {
    public static int search(int arr[],int target)
    {
        return find(arr,0,target);
    }
    public static int find(int arr[],int i, int target)
    {
        if(i==arr.length)
            return -1;
        if(arr[i]==target)
        {
            return i;
        }
        return find(arr,i+1,target);
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,60,80,40};
        int taregt=60;
        int ans=search(arr,taregt);
        if(ans==-1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at index: "+ans);
    }
}
