#include <iostream>
using namespace std;

class Node
{
public:
    int value;
    Node *left;
    Node *right;

    Node(int value)
    {
        this->value = value;
        this->left = NULL;
        this->right = NULL;
    }
};

// Function to print inorder
void printInOrder(Node *head)
{
    Node *temp = head;
    if (temp == NULL)
    {
        return;
    }
    printInOrder(temp->left);
    cout << temp->value << " ";
    printInOrder(temp->right);
}

// Function to print preorder
void printPreOrder(Node *head)
{
    Node *temp = head;
    if (temp == NULL)
    {
        return;
    }
    cout << temp->value << " ";
    printPreOrder(temp->left);
    printPreOrder(temp->right);
}

// Function to print postorder
void printPostOrder(Node *head)
{
    Node *temp = head;
    if (temp == NULL)
    {
        return;
    }

    printPostOrder(temp->left);
    printPostOrder(temp->right);
    cout << temp->value << " ";
}

int main()
{
    Node *a = new Node(1);
    Node *b = new Node(2);
    Node *c = new Node(3);
    Node *d = new Node(4);
    Node *e = new Node(5);
    Node *f = new Node(6);

    a->left = b;
    a->right = c;
    b->left = d;
    b->right = e;
    c->left = f;

    // Function to do inorder traversal
    void printInOrder(Node * head);
    // printInOrder(a);

    // Function to do preorder traversal
    void printPreOrder(Node * head);
    // printPreOrder(a);

    // Function to do Postorder traversal
    void printPostOrder(Node * head);
    printPostOrder(a);

    return 0;
}