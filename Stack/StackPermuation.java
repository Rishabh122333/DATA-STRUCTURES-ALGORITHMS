import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPermuation {
    public static boolean haspermutation(int arr[], int arr1[]) {
        Queue<Integer> input = new LinkedList<>();
        Queue<Integer> output = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            input.add(arr[i]);
            output.add(arr1[i]);
        }
        Stack<Integer> stack = new Stack<>();
        while (!input.isEmpty())
        {
            stack.push(input.remove());
            if(stack.peek()==output.peek())
            {
                while(!stack.isEmpty())
                {
                    if(stack.peek()== output.peek()) {
                        stack.pop();
                        output.remove();
                    }
                    else
                        break;
                }
            }
        }
        return (stack.isEmpty() && input.isEmpty());
    }
    public static void main(String[] args)
    {
        int input[] = { 1, 2, 3 };
        int output[] = { 3, 1, 2 };
        if (haspermutation(input, output))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
