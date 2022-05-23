class LinearSearch
{
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }


    public static void main(String args[])
    {
        int arr[] = { 20, 30, 40, 10, 80 };
        int x = 40;


        int res = search(arr, x);
        if (res == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + res);
    }
}