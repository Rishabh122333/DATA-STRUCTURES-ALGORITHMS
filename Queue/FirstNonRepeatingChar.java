import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChar {
    public static void compute(String str)
    {
        int arr[]=new int[26];
        Queue<Character> queue=new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 97]++;
            queue.add(ch);
            while (!queue.isEmpty()) {
                char ch1 = queue.peek();
                if (arr[ch - 97] > 1)
                    queue.poll();
                else {
                    System.out.print(ch1);
                    break;
                }
            }
            if(queue.isEmpty())
                System.out.print("-1");
        }
    }
    public static void main(String[] args)
    {
        String str = "aaabcdd";
        compute(str);
    }
}
