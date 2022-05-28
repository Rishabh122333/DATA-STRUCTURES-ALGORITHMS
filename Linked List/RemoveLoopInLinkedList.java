//Detect and Remove Loop in a Linked List

public class RemoveLoopInLinkedList {
   static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static boolean detectLoop(Node head) {
        Node fast = head;
        Node slow = head;
        int l = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
               Node start= getloopnode(head,slow);
                reomoveloop(head,start);
                return true;
            }
        }
        return false;
    }

    public static Node getloopnode(Node head, Node slow) {
        Node temp = slow;
        int l = 0;
        do {
            temp = temp.next;
            l++;
        } while (temp != slow);
        if (l == 0)
            return null;
        Node f = head;
        Node s = head;
        while (l > 0) {
            s = s.next;
            l--;
        }
        while(f !=s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public static void reomoveloop(Node head, Node start) {
        Node temp=start;
        Node prev=null;
        do {
            prev=temp;
            temp=temp.next;
            if(temp==start)
            {
                prev.next=null;
                break;
            }
        } while(prev.next!=null);
    }
   public static void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        RemoveLoopInLinkedList list = new RemoveLoopInLinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.next = list.head.next.next;
        boolean ans = detectLoop(list.head);
        if (ans) {
            System.out.println("Linked List after removing loop : ");
            printList();
        } else
            System.out.println("No loop");
    }
}



