public class StackQueueUsingDequeue {
    static class Dequeue {
        static Node head;
        Dequeue()
        {
            head=null;
        }
        
        static class Node {
            int data;
            Node next;
            Node prev;

            Node(int d) {
                data = d;
                next = null;
                prev = null;
            }
        }

        public void addLast(int x) {
            Node n = new Node(x);
            if (head == null) {
                head = n;
                head.prev = null;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            n.prev = temp;
            temp.next = n;
        }

        public void addFirst(int x) {
            Node n = new Node(x);
            if (head == null) {
                head = n;
                head.prev = null;
                return;
            }
            n.next = head;
            head = n;
            head.prev = null;
        }

        public int removeLast() {
            if (isEmpty())
                return -Integer.MIN_VALUE;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            int x = temp.data;
            temp = temp.prev;
            temp.next = null;
            return x;
        }

        public int removeFirst() {
            int x;
            if (isEmpty())
                return -Integer.MIN_VALUE;
            if (head.next == null) {
                x = head.data;
                head = null;
            }
            x = head.data;
            head = head.next;
            head.prev = null;
            return x;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    static class Stack
    {
        Dequeue d=new Dequeue();
        public void push(int x)
        {
            d.addLast(x);
        }
        public int pop()
        {
            return d.removeLast();
        }
        public boolean isEmpty()
        {
            return d.isEmpty();
        }
        public void display()
        {
            d.display();
        }
    }
    static class Queue
    {
        Dequeue d=new Dequeue();
        public void insert(int x)
        {
            d.addLast(x);
        }
        public int remove()
        {
            return d.removeFirst();
        }
        public boolean isEmpty()
        {
            return d.isEmpty();
        }
        public void display()
        {
            d.display();
        }
    }
    public static void main(String[] args)
    {
        Stack stk = new Stack();
        stk.push(7);
        stk.push(8);
        System.out.print("Stack: ");
        stk.display();
        System.out.println();
        stk.pop();
        System.out.print("Stack: ");
        stk.display();
        System.out.println();
        Queue que = new Queue();
        que.insert(12);
        que.insert(13);
        System.out.print("Queue: ");
        que.display();
        System.out.println();
        que.remove();
        System.out.print("Queue: ");
        que.display();
        System.out.println();
    }
}
