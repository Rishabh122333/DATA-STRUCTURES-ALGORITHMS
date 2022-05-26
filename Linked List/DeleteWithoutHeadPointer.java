//Given a pointer to a node to be deleted, delete the node. Note that we don’t have a pointer to the head node.

public class DeleteWithoutHeadPointer {
    Node head;

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void deleteNode(Node del) {
        del.data=del.next.data;
        del.next=del.next.next;
    }

    public static void main(String[] args) {
        DeleteWithoutHeadPointer list = new DeleteWithoutHeadPointer();
        list.push(1);
        list.push(4);
        list.push(1);
        list.push(12);
        list.push(1);
        System.out.println("Before deleting");
        list.printList();
        list.deleteNode(list.head);
        System.out.println("\nAfter Deleting");
        list.printList();
    }

    private class Node {
        Node next;
        int data;

        Node(int d) {
            next = null;
            this.data = d;
        }
    }
}