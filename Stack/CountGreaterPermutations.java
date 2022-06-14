import java.util.Stack;

public class CountGreaterPermutations {
public static int countpermutations(int n)
{
    if(n<10)
        return n;
    else {
        int c = 9;
        Stack<Integer> stack = new Stack<>();
        for (int i = 11; i <=n; i++) {
            int t = i;
            while (t != 0) {
                stack.push(t % 10);
                t = t / 10;
                int d = t % 10;
                if (stack.peek() <d) {
                    break;
                }
                stack.pop();
            }
            if(t==0)
                c++;
        }
        return c;
    }
}
    public static void main(String[] args)
    {
        System.out.println(countpermutations(100));
    }
}
