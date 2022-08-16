#include <iostream>
using namespace std;

class Node
{
public:
    int value;
    Node *next;

    Node(int value)
    {
        this->value = value;
        this->next = NULL;
    }
};

void insertAtHead(Node *&head, int value)
{
    if (head == NULL)
    {
        // This node will be both head and tail node
        Node *newnode = new Node(value);
        head = newnode;
    }
    Node *newnode = new Node(value);
    newnode->next = head;
    head = newnode;
}

void print(Node *head)
{
    Node *temp = head;
    while (temp != NULL)
    {
        cout << temp->value << " ";
        temp = temp->next;
    }
}

int main()
{
    Node *a = new Node(1);
    Node *b = new Node(2);
    Node *c = new Node(3);

    a->next = b;
    b->next = c;

    int value;
    cout << "Enter value to be inserted : ";
    cin >> value;

    // Function to insert value at head
    void insertAtHead(Node * &head, int value);
    insertAtHead(a, value);

    // Function to print singly linked list
    void print(Node * head);
    print(a);

    return 0;
}