public class RotatedMtnArraySearch {
    public static int binarySearch(int[] arr, int target,int start,int end) {
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                return mid;
            }
        }
        return -1;
    }
    public static int findpivot(int arr[])
    {
        int beg = 0;
        int end = arr.length - 1;

        while(beg<=end)
        {
            int mid = beg + (end - beg) / 2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            else if(mid>beg && arr[mid]<arr[mid-1])
                return mid-1;
            else if(arr[beg]<=arr[mid])
                beg=mid+1;
            else if(arr[beg]>arr[mid])
                end=mid-1;
        }
        return -1;
    }
    public static int search(int[] arr, int target) {
        int pivot=findpivot(arr);
        int ans=binarySearch(arr,target,0,pivot);
        if(ans==-1)
            ans=binarySearch(arr,target,pivot+1,arr.length-1);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,8,1,4,6,7};
        int target=3;
        int ans=search(arr,target);
        if(ans==-1)
            System.out.println("Target not found");
        else
            System.out.println("Target is found at index "+ans);

    }
}
