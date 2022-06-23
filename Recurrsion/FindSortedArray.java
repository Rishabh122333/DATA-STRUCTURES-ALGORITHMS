public class FindSortedArray {
     public static boolean sorted(int arr[])
     {
         return check(arr,0);
     }
     public static boolean check(int arr[],int i)
     {
         if(i== arr.length-1)
             return true;
         return arr[i]<arr[i+1] && check(arr,i+1);
     }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        if(sorted(arr))
            System.out.println("Sorted Array");
        else
            System.out.println("Unsoretd Array");
    }
}
