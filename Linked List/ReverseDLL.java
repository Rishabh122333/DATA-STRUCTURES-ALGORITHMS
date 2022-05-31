// Reverse a Doubly Linked List.

class Main
{
    Node head;
    static class Node {
        int data;
        Node next, prev;
    }
    public static Node push(Node head, int key)
    {
        Node node = new Node();
        node.data = key;
        node.prev = null;
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        return head;
    }
    public static void printDDL(String msg, Node head)
    {
        System.out.print(msg);
        while (head != null)
        {
            System.out.print(head.data + " —> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static Node reverseDDL(Node head)
    {
        if(head==null)
            return head;
        Node prev=null;
        Node temp=head;
        while(temp!=null)
        {
            Node t=temp.prev;
            temp.prev=temp.next;
            temp.next=t;
            prev=temp;
            temp=temp.prev;

        }
        if(prev!=null) {
            head = prev;
        }
        return head;
    }

    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5 };

        Node head = null;
        for (int key: keys) {
            head = push(head, key);
        }

        printDDL("Original list: ", head);
        head = reverseDDL(head);
        printDDL("Reversed list: ", head);
    }
}
