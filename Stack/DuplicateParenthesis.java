import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean hasduplicate(String str)
    {
        Stack<Character> stack=new Stack<>();
        char ch,ch1;
        int c;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if(ch!=')')
                stack.push(ch);
            else
            {
                c=0;
                ch1=stack.pop();
                while(ch1!='(')
                {
                    c++;
                    ch1=stack.pop();
                }
                if(c==0)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        if (hasduplicate(str))
            System.out.println("Duplicate Found ");
         else
            System.out.println("No Duplicates Found ");
    }
}
