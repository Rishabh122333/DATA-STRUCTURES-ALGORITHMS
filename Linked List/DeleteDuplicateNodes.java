//Write a function that takes a list and deletes any duplicate nodes from the list. The list is not sorted.

public class DeleteDuplicateNodes {
        static Node head;
        static class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }
    void removeDuplicates( Node head)
    {
        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            Node temp1=temp;
            while(temp1.next!=null)
            {
                if(temp.data== temp1.next.data)
                {
                    temp1.next=temp1.next.next;
                }
                else
                    temp1=temp1.next;
            }
            temp=temp.next;
        }
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        DeleteDuplicateNodes   list = new DeleteDuplicateNodes ();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked List before removing duplicates :  ");
        list.printList(head);

        list.removeDuplicates(head);
        System.out.println("");
        System.out.println("Linked List after removing duplicates :  ");
        list.printList(head);
    }
}
