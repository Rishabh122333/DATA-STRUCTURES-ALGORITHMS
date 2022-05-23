public class FloorOfNumber {
    public static int findfloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target>arr[end])
            return -1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                return arr[mid];
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 19;
        int ans = findfloor(arr, target);
        if (ans == -1)
            System.out.print("Floor of the number is not present in the array");
        else
            System.out.print("Floor of the number is " + ans);
    }
}
