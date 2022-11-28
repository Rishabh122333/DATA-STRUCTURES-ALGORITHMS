import java.util.Stack;

public class NextGreaterElement {
    public static void nextgreater(int arr[])
    {
        int ans[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        for (int i = 0; i < ans.length; i++) {
            while(!(st.isEmpty()) && arr[i]>arr[st.peek()])
            {
                int idx=st.pop();
                ans[idx]=arr[i];
            }
            st.push(i);
        } 
        while(!st.isEmpty())
        {
            ans[st.peek()]=-1;
            st.pop();
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
    }
    public static void main(String[] args)
    {
        int arr[] = { 4, 5, 2, 25 };
        nextgreater(arr);
    }
}
