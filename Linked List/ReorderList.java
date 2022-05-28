//You are given the head of a singly linked-list. The list can be represented as:
//L0 → L1 → … → Ln - 1 → Ln
//Reorder the list to be on the following form:
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

public class ReorderList {
    Node head;
    static class Node
    {
        int data;
       Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node middleNode(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static Node reverseList(Node head) {
        if(head==null)
            return head;
        Node prev=null;
        Node temp=head;
        Node next=temp.next;
        while(temp!=null)
        {
            temp.next=prev;
            prev=temp;
            temp=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        head=prev;
        return head;
    }
    public static void reorderList(Node head) {
        if(head==null || head.next==null)
            return;
        Node mid=middleNode(head);
        Node hs=reverseList(mid);
        while(head!=null && hs!=null)
        {
            Node temp=head.next;
            head.next=hs;
            head=temp;
            temp=hs.next;
            hs.next=head;
            hs=temp;
        }
        if(head!=null)
            head.next=null;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public void push(int val) {
       Node node = new Node(val);
        node.next = head;
        head = node;
    }
    public static void main(String[] args)
    {
        ReorderList llist = new ReorderList();

        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        System.out.println("\nCreated Linked list is:");
        llist.printList();
        reorderList(llist.head);
        System.out.println("\nLinked List after Reordering is:");
        llist.printList();
    }
}
