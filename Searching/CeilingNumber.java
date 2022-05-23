public class CeilingNumber {
    public static int findceil(int[] arr, int target) {
        int beg = 0;
        int end = arr.length - 1;
        if(target>arr[end])
            return -1;

        while(beg <= end) {

            int mid = beg + (end - beg) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                beg = mid + 1;
            }
            else
                return arr[mid];
        }
        return arr[beg];
    }

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 79;
        int ans = findceil(arr, target);
        if (ans == -1)
            System.out.print("Ceil of the number is not present in the array");
        else
            System.out.print("Ceil of the number is " + ans);
    }
}
