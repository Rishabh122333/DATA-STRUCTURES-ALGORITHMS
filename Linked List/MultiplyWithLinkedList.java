//Given two numbers represented by linked lists, write a function that returns the multiplication of these two linked lists.

public class MultiplyWithLinkedList {
    static class Node
    {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head1,head2;
    public static int sizeoflist(Node head)
    {
        Node temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return  c;
    }
    public static int multiplylist(Node head1, Node head2)
    {
        int a=0,b=0;
        Node temp=head1;
        int c=sizeoflist(head1)-1;
        while(temp!=null)
        {
            a+=temp.data*Math.pow(10,c--);
            temp=temp.next;
        }
        temp=head2;
        c=sizeoflist(head2)-1;
        while(temp!=null)
        {
            b+=temp.data*Math.pow(10,c--);
            temp=temp.next;
        }
        return a*b;
    }
    static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data);
            if(node.next != null)
                System.out.print("->");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Node head1 = new Node(3);
        head1.next = new Node(2);
        head1.next.next = new Node(1);
        System.out.print("First List is: ");
        printList(head1);
        Node head2 = new Node(1);
        head2.next = new Node(2);
        System.out.print("Second List is: ");
        printList(head2);
        System.out.print("Result is: ");
        System.out.println(multiplylist(head1, head2));
    }
}
