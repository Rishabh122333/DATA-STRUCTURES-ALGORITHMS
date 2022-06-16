import java.util.Stack;

public class CelebrityProblem {
    public static int solution(int arr[][])
    {
        Stack<Integer>stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty())
                break;
            if(arr[stack.peek()][i]==1)
            {
                stack.pop();
                i=0;
                continue;
            }
        }
        if (stack.isEmpty())
            return -1;
        return stack.peek();
    }
    public static void main(String[] args)
    {
        int arr[][]={ { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 1, 0 } };
        int id = solution(arr);
        if (id == -1) {
            System.out.println("No celebrity");
        }
        else {
            System.out.println("Celebrity ID " + id);
        }
    }
}
