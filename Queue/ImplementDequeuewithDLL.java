public class ImplementDequeuewithDLL {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d)
        {
            data=d;
            next=null;
            prev=null;
        }
    }
    public void addLast(int x)
    {
        Node n=new Node(x);
        if(head==null) {
            head=n;
            head.prev=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        n.prev=temp;
        temp.next=n;
    }
    public void addFirst(int x)
    {
        Node n=new Node(x);
        if(head==null) {
            head=n;
            head.prev=null;
            return;
        }
        n.next=head;
        head=n;
        head.prev=null;
    }
    public int removeLast()
    {
        if(head==null)
            return -Integer.MIN_VALUE;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        int x=temp.data;
        temp=temp.prev;
        temp.next=null;
        return x;
    }
    public int removeFirst()
    {
        int x;
        if(head==null)
            return -Integer.MIN_VALUE;
        if(head.next==null) {
            x= head.data;
            head = null;
        }
        x=head.data;
        head=head.next;
        head.prev=null;
        return x;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        ImplementDequeuewithDLL d=new ImplementDequeuewithDLL();
        d.addLast(40);
        d.addLast(50);
        d.addFirst(30);
        d.addFirst(20);
        d.addLast(60);
        d.addFirst(10);
        System.out.println(d.removeFirst());
        System.out.println(d.removeLast());
        d.display();
    }
}
