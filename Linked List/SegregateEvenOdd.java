//Segregate even and odd nodes in a Linked List.

public class SegregateEvenOdd {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public Node segregateEvenOdd(Node head)
    {
        if(head==null)
            return head;
        Node temp=head;
        Node teven= new Node(-1);
        Node todd= new Node(-1);
        Node even=teven;
        Node odd=todd;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                even.next=temp;
                even=even.next;
            }
            if(temp.data%2!=0)
            {
                odd.next=temp;
                odd=odd.next;
            }
            temp=temp.next;
        }
        if(teven.next ==null)
            return todd.next;
        else
        {
        even.next=todd.next;
        odd.next=null;
        return teven.next;
       }
    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        SegregateEvenOdd llist = new SegregateEvenOdd();
        llist.push(11);
        llist.push(10);
        llist.push(9);
        llist.push(6);
        llist.push(4);
        llist.push(1);
        llist.push(0);
        System.out.println("Original Linked List");
        llist.printList(llist.head);
        System.out.println("Modified Linked List");
        llist.printList( llist.segregateEvenOdd(llist.head));
    }
}
