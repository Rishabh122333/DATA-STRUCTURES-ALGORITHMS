import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReversekElementsofQueue {
    public static Queue<Integer> rev(Queue<Integer> q,int k){
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < k; i++)
            stack.push(q.remove());
        while (!(stack.isEmpty()))
            q.add(stack.pop());
        for (int i = 0; i < q.size()-k; i++) {
            q.add(q.remove());
        }
        return q;
    }
    static void print(Queue<Integer>queue)
    {
        while (!queue.isEmpty())
            System.out.print( queue.remove() + " ");
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        int k=5;
        queue=rev(queue,k);
        print(queue);
    }
}
