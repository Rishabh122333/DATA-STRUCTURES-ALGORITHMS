import java.util.Stack;
public class PostfixEvaluationStack {
    public static int evaluate(String str)
    {
        Stack<Integer>stack=new Stack<>();
        char ch;
        for (int i = 0; i <str.length(); i++) {
            ch=str.charAt(i);
            if(ch==' ')
                continue;
            if(Character.isDigit(ch))
                stack.push(ch-48);
            else
            {
                int a=stack.pop();
                int b=stack.pop();
                if(ch=='+')
                    stack.push(b+a);
                else if(ch=='-')
                    stack.push(b-a);
                else if(ch=='*')
                    stack.push(b*a);
                else if(ch=='/')
                    stack.push(b/a);
                else if(ch=='%')
                    stack.push(b%a);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String str="231*+9-";
        System.out.println(evaluate(str));
    }
}
