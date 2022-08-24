import java.util.*;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
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
        c.next = d;

        // Function to insert value at the head
        insertHead(a);

        // Function to print
        print(a);
    }

    static void insertHead(Node head) {

        int value = sc.nextInt();
        Node temp = head;
        if (temp != null) {
            System.out.println("Value can not be inserted");
            return;
        }

        Node newnode = new Node(value);
        newnode.next = temp;
        temp = newnode;
        return;
    }

    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
        }
    }

}
