public class SearchInfiiteArray {
    public  static int position(int arr[],int target) {
        int beg = 0;
        int end = 1;
        while (target >arr[end]) {
            int temp = end + 1;
            end = end + (end-beg+1)*2;
            beg=temp;
        }


        return  binarySearch(arr, target, beg, end);
    }
    public static int binarySearch(int[] arr, int target,int beg,int end) {
        while(beg <= end) {

            int mid = beg + (end - beg) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                beg = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=10;
        int ans = position(arr,target);
        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }
}
