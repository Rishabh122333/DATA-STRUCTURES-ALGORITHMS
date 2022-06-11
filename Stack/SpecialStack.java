import java.util.Stack;

public class SpecialStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public void push(int x)
    {
        if(stack.isEmpty() || min.isEmpty())
        {
            stack.push(x);
            min.push(x);
            return;
        }
        stack.push(x);
        if(stack.peek()<min.peek())
        {
            min.push(x);
        }
    }
    public int pop()
    {
        if(stack.isEmpty())
            return -Integer.MIN_VALUE;
        int x=stack.pop();
        if(x==min.peek())
            min.pop();
        return x;
    }
    public int getMin()
    {
        return min.peek();
    }
    public static void main(String[] args)
    {
        SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}
