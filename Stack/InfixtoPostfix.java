import java.util.Stack;

public class InfixtoPostfix {
    public static int precedence(char ch)
    {
        if(ch=='+' || ch=='-')
            return 1;
        else if(ch=='/' || ch=='*' || ch=='%')
            return 2;
        else if(ch=='^')
            return 3;
        return -1;
    }
    public static String convert(String str)
    {
        String ans="";
        Stack<Character>stack=new Stack<>();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch))
                ans+=ch;
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')')
            {
                while (!stack.isEmpty() && stack.peek()!='(')
                    ans+=stack.pop();
                stack.pop();
            }
            else
            {
                while(!(stack.isEmpty()) && precedence(ch)<=precedence(stack.peek()))
                    ans+=stack.pop();
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
            ans+=stack.pop();
        return ans;
    }
    public static void main(String[] args)
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(convert(exp));
    }
}