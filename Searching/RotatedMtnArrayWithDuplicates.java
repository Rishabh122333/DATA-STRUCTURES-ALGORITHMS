public class RotatedMtnArrayWithDuplicates {
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
    public static int findpivotwithduplicates(int arr[])
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
            // remove dupliates
           else if(arr[mid]==arr[beg] && arr[mid]==arr[end])
            {
                // check if beg is the pivot
                if(arr[beg]>arr[beg+1])
                    return arr[beg];
                beg++;
                // check if end is the pivot
                if(arr[end]<arr[end-1])
                    return arr[end-1];
                end--;
            }
           // check if left side is sorted so check for pivot in the right side
           else if(arr[beg]<arr[mid] || arr[mid]==arr[beg] && arr[end]<arr[mid])
               beg=mid+1;
           // check for pivot in left side
           else
               end=mid-1;
        }
        return -1;
    }
    public static int search(int[] arr, int target) {
        int pivot= findpivotwithduplicates(arr);
        int ans=binarySearch(arr,target,0,pivot);
        if(ans==-1)
            ans=binarySearch(arr,target,pivot+1,arr.length-1);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2,2,5,2,2,2,3,4,4};
        int target=3;
        int ans=search(arr,target);
        if(ans==-1)
            System.out.println("Target not found");
        else
            System.out.println("Target is found at index "+ans);
    }
}
