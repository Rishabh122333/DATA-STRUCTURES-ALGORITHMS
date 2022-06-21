public class BinarySearch {
    public static int search(int arr[],int beg,int end,int target)
    {
        if(beg>end)
            return -1;
        int mid=beg+(end-beg)/2;
        if(arr[mid]==target)
            return mid;
        if(target>arr[mid])
            return search(arr,mid+1,end,target);
        return search(arr,beg,mid-1,target);
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        System.out.println("Tearget found at index: "+search(arr,0,arr.length-1,40));
    }
}
