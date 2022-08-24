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

public class Insert {

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

        // Function to insert value at the head
        // insertHead(a);

        // Funciton to insert value at the tail
        // insertAtTail(a);

        // Function to insert node at the middle
        insertAtMiddle(a);

        // Function to print
        print(a);
    }

    static void insertHead(Node head) {

        Node temp = head;
        int value;
        System.out.print("Enter value to be inserted : ");
        value = sc.nextInt();
        Node newnode = new Node(value);

        if (temp == null) {
            // Means new node is the head node itself
            temp = newnode;
            return;
        }

        newnode.next = temp;
        temp.prev = newnode;
        temp = newnode;

    }

    static void insertAtTail(Node head) {
        int value;
        System.out.print("Enter value to be inserted : ");
        value = sc.nextInt();
        Node newnode = new Node(value);
        Node temp = head;
        if (temp == null) {
            // This newnode is both head and tail node
            temp = newnode;
        }

        // Find the tail node
        Node find = head;
        while (find.next != null) {
            find = find.next;
        }

        // Now we have found the tail node
        find.next = newnode;
        newnode.prev = find;
        find = newnode;
    }

    static void insertAtMiddle(Node head) {
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
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        newnode.next = slow.next;
        slow.next.prev = newnode;
        slow.next = newnode;
        slow = newnode;
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
