public class DeleteMiddleofStack {
    static class Dequeue {
        static Node head,mid;
        Dequeue()
        {
            head=mid=null;
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
        public int findmid()
        {
            Node fast=head;
            Node slow=head;
            while(fast!=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            mid=slow;
            return mid.data;
        }
        public void deletemid()
        {
            int x;
            if(head==null)
                return;
            mid.prev.next=mid.next;
            mid.next.prev=mid.prev;
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
        Dequeue d=new Dequeue();
        public void push(int x)
        {
            d.addLast(x);
        }
        public int pop()
        {
            return d.removeLast();
        }
        public int findmid()
        {
            return d.findmid();
        }
        public void deletemid()
        {
             d.deletemid();
        }
        public boolean isEmpty()
        {
            return d.isEmpty();
        }
        public void display()
        {
            d.display();
        }

    public static void main(String[] args) {
        DeleteMiddleofStack ms = new DeleteMiddleofStack();
        ms.push(11);
        ms.push(22);
        ms.push(33);
        ms.push(44);
        ms.push(55);
        ms.push(66);
        ms.push(77);
        ms.push(88);
        ms.push(99);

        System.out.println("Popped : " + ms.pop());
        System.out.println("Popped : " + ms.pop());
        System.out.println("Middle Element : " + ms.findmid());
        ms.deletemid();
        System.out.println("New Middle Element : " + ms.findmid());
    }
}
