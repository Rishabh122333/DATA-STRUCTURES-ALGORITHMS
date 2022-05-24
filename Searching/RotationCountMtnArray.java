public class RotationCountMtnArray {
    // use this function if array does not have duplicate values
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
    // use this function if array has duplicate values
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
    public static int count(int arr[])
    {
        return findpivot(arr) +1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int ans=count(arr);
        System.out.println("Array is rotated "+ans +" times");
    }
}
