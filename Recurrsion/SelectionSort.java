import java.util.Arrays;

public class SelectionSort {
    public static void sort(int arr[],int i,int j,int min)
    {
        if(i== arr.length-2)
            return;
        min=i;
        if(j< arr.length)
        {
            if(arr[j]<arr[min])
                min=j;
            sort(arr,i,j+1,min);
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
        sort(arr,i+1,i+2,0);

    }

    public static void main(String[] args) {
        int arr[]={10,60,40,20,30,50};
        System.out.println("Orignal Array");
        System.out.println(Arrays.toString(arr));
        sort(arr,0,1,0);
        System.out.println("\nSorted Array");
        System.out.println(Arrays.toString(arr));
    }
}
