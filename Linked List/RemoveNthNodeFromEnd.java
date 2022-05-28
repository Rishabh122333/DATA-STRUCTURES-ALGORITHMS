//Remove Nth Node from the end of the Linked List.

public class RemoveNthNodeFromEnd {
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
    public static Node deletefirst(Node head) {
        head = head.next;
        return head;
    }
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
    public static Node get(Node head,int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp= temp.next;
        }
        return temp;
    }
    public static Node deletelast(Node head) {
        int x=sizeoflist(head);
        Node prev = get(head,x-2);
        prev.next = null;
        return head;
    }
    public Node removeNthFromEnd(Node head, int n) {
        if(head==null)
            return head;
        int x=sizeoflist(head);
        if(x==1)
            return null;
        if(n==x)
            return deletefirst(head);
        if(n==1)
            return deletelast(head);
        Node prev = get(head,x-n-1);
        if(prev.next.next!=null)
            prev.next = prev.next.next;
        return head;
    }
    public void printList(Node head)
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
        RemoveNthNodeFromEnd llist = new RemoveNthNodeFromEnd();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList(llist.head);

        int N = 2;
        Node ans=llist.removeNthFromEnd(llist.head,N);

        System.out.println("\nLinked List after Deletion is:");
        llist.printList(ans);
    }
}