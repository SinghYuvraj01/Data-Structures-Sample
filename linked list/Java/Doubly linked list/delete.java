import java.util.*;

class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

public class delete {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Dynamically creation of node
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        // Assign the next part to nodes
        a.next = b;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.prev = c;

        // Function to delete value at the head
        deleteHead(a);

        // Funciton to delete value at the tail
        // deleteAtTail(a);

        // Function to delete node at the middle
        // deleteAtMiddle(a);

        // Function to print
        print(a);
    }

    static void deleteHead(Node head) {

        Node temp = head;
        if (temp == null) {
            // Nothing to delete
            System.out.println("Nothing to delete");
            return;
        }

        Node newhead = temp.next;
        newhead.prev = null;

    }

    static void deleteAtTail(Node head) {
        int value;

        Node temp = head;
        if (temp == null) {
            // Nothing to delete
            System.out.println("Nothing to delete");
            return;
        }

        // Find the tail node
        Node find = head;
        while (find.next.next != null) {
            find = find.next;
        }

        // Now we have found the node before tail node
        find.next = null;
    }

    static void deleteAtMiddle(Node head) {
        int value;
        System.out.print("Enter value to be inserted : ");
        value = sc.nextInt();
        Node newnode = new Node(value);
        Node temp = head;
        if (temp == null) {
            // This node is both head and tail node
            temp = newnode;
        }

        // Find the middle node
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node remove = slow.next;
        slow.next = remove.next;
        remove.next.prev = slow;

    }

    static void print(Node head) {
        Node temp = head;
        System.out.print("The value in doubly linked list are : ");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
