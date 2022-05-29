//Rearrange a Linked List in Zig-Zag fashion

public class ZigZagList {
    static Node head;
    public static class Node
    {
        int data;
        Node next;
        Node child;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node zigzag(Node head)
    {
        Node temp=head;
        int t,f=0;
        while(temp!=null && temp.next!=null) {
            if (f == 1) {
                if (temp.next.data > temp.data)
                {
                    t=temp.next.data;
                    temp.next.data= temp.data;
                    temp.data=t;
                }
                f=0;
            }
            else if(f==0)
            {
                if (temp.next.data < temp.data)
                {
                    t=temp.next.data;
                    temp.next.data= temp.data;
                    temp.data=t;
                }
                f=1;
            }
            temp=temp.next;
        }
        return  head;
    }
    public static void printList(Node head)
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void push(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }
    public static void main(String[] args)
    {
        ZigZagList list=new ZigZagList();
        list.push(1);
        list.push(2);
        list.push(6);
        list.push(8);
        list.push(7);
        list.push(3);
        list.push(4);
        System.out.println("Given linked list ");
        printList(list.head);
        zigzag(list.head);
        System.out.println("\nZig Zag Linked list ");
        printList(list.head);
    }
}
