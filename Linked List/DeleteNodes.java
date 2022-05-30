//Delete nodes which have a greater value on right side

public class DeleteNodes {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node delete(Node head) {
        if(head==null)
            return head;
        Node temp = head;
       while(temp!=null && temp.next!=null)
       {
           if(temp.data< temp.next.data) {
               temp.data=temp.next.data;
               temp.next=temp.next.next;
           }
           else
               temp=temp.next;
        }
        return head;
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
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        DeleteNodes llist = new DeleteNodes();
        llist.push(3);
        llist.push(2);
        llist.push(6);
        llist.push(5);
        llist.push(11);
        llist.push(10);
        llist.push(15);
        llist.push(12);
        System.out.println("Given Linked List");
        llist.printList(llist.head);
        System.out.println("Modified Linked List");
        llist.printList(llist.delete(llist.head));
    }
}
