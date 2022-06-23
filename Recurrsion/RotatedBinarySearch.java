public class RotatedBinarySearch {
    public static int search(int arr[],int target)
    {
        return find(arr,0,arr.length-1,target);
    }
    public static int find(int arr[],int start,int end, int target)
    {
        if(start>end)
            return -1;
       int mid=start+(end-start)/2;
       if(arr[mid]==target)
           return mid;
       if(arr[mid]>=arr[start])
       {
           if(target>=arr[start] && target<=arr[mid])
           {
               return find(arr,start,mid-1,target);
           }
           else
               return find(arr,mid+1,end,target);
       }
       if(target>arr[mid]&& target<arr[end])
       {
            return find(arr,mid+1,end,target);
       }
       else
           return find(arr,start,mid-1,target);
    }

    public static void main(String[] args) {
        int arr[]={40,50,60,10,20,30};
        int target=20;
        int ans=search(arr,target);
        if(ans==-1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at index: "+ans);
    }
}
