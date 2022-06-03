//Sort a Linked List using Merge Sort.

class MergeSortLinkedList{
     static class Node {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            next = null;
        }
    }
    static Node sort(Node head)
    {
        if (head==null || head.next == null)
            return head;

        Node mid = findMid(head);
        Node head2 = mid.next;
        mid.next = null;
        Node temp1 = sort(head);
        Node temp2 = sort(head2);
        return  merge(temp1, temp2);
    }
    static Node merge(Node head1, Node head2)
    {
        Node list = new Node(-1);
        Node temp = list;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return list.next;
    }
    static Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args)
    {
        Node head = new Node(7);
        Node temp = head;
        temp.next = new Node(10);
        temp = temp.next;
        temp.next = new Node(5);
        temp = temp.next;
        temp.next = new Node(20);
        temp = temp.next;
        temp.next = new Node(3);
        temp = temp.next;
        temp.next = new Node(2);
        temp = temp.next;
        System.out.println("Linked List created is:");
        printList(head);
        System.out.println("\nSorted Linked List is:");
        printList(sort(head));
    }
}