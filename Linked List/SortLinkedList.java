//Given a linked list of 0s, 1s and 2s, sort it.

public class SortLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d; next = null;
        }
    }
    void sortList()
    {
        Node temp=head;
        int c0=0,c2=0,c1=0;
        while(temp!=null)
        {
            if(temp.data==0)
                c0++;
            else if(temp.data==1)
                c1++;
            else
                c2++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null) {
            if (c0 != 0) {
                temp.data = 0;
                c0--;
            }
            else if (c1 != 0) {
                temp.data = 1;
                c1--;
            }
            else if (c2 != 0) {
                temp.data = 2;
                c2--;
            }
            temp=temp.next;
        }}
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        SortLinkedList list = new SortLinkedList();
        list.push(0);
        list.push(1);
        list.push(0);
        list.push(2);
        list.push(1);
        list.push(1);
        list.push(2);
        list.push(1);
        list.push(2);

        System.out.println("Linked List before sorting");
        list.printList();

        list.sortList();

        System.out.println("Linked List after sorting");
        list.printList();
    }
}


