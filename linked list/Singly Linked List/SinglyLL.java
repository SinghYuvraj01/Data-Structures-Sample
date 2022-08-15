
import java.util.*;

// First of all we will make class Node
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        next = null;
    }
}

public class SinglyLL {

    public static void main(String[] args) throws Exception {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        // Assigning the next value
        a.next = b;
        b.next = c;
        c.next = d;

        // Funciton to print the linked list
        print(a);

    }

    static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
