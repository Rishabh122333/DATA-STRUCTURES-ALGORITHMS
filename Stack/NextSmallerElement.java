import java.util.Stack;

public class NextSmallerElement {
    public static int[] nextsmaller(int arr[])
    {
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            if(!stack.isEmpty())
            {
                while (!stack.isEmpty() && stack.peek()>=arr[i])
                    stack.pop();
            }
            if(stack.isEmpty())
                ans[i]=-1;
            else
                ans[i]=stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = { 13, 7, 6, 12 };
        int ans[]=nextsmaller(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i]+" -- "+ans[i]);
        }
    }
}
