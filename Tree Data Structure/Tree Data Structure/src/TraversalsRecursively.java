
import java.util.*;

// First of all we will create Node class
class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
};

public class TraversalsRecursively {
    public static void main(String[] args) throws Exception {

        // First of all let us build the tree
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        // Now assign the left and right value
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        // Call function for inorder travesal (Recursively)
        printInOrder(a);
    }

    static void printInOrder(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        printInOrder(temp.left);
        System.out.println(temp.value);
        printInOrder(temp.right);

    }
}
