#include <iostream>
using namespace std;

class Node
{
public:
    int value;
    Node *next;
    Node *prev;

    Node(int value)
    {
        this->value = value;
        this->next = NULL;
        this->prev = NULL;
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
    head->prev = newnode;
    head = newnode;
}

void insertAtEnd(int value, Node *&head)
{
    if (head == NULL)
    {
        // This node will be both head and tail node
        Node *newnode = new Node(value);
        head = newnode;
    }
    Node *temp = head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    Node *newnode = new Node(value);
    temp->next = newnode;
    newnode->prev = temp;
    temp = newnode;
}

void insertAtMiddle(int value, Node *&head)
{
    if (head == NULL)
    {
        // This node will be both head and tail node
        Node *newnode = new Node(value);
        head = newnode;
    }
    Node *slow = head;
    Node *fast = head;
    while (fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }
    Node *newnode = new Node(value);
    newnode->next = slow->next;
    newnode->prev = slow;
    slow->next = newnode;
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
    b->prev = a;
    b->next = c;
    c->prev = b;

    int value;
    cout << "Enter value to be inserted : ";
    cin >> value;

    // Function to insert value at head
    void insertAtHead(Node * &head, int value);
    // insertAtHead(a, value);

    // Function to insert value at end
    void insertAtEnd(int value, Node *&head);
    // insertAtEnd(value, a);

    // Function to insert value at middle
    void insertAtMiddle(int value, Node *&head);
    insertAtMiddle(value, a);

    // Function to print singly linked list
    void print(Node * head);
    print(a); // In case of insertion at head ( pass c and do temp = temp->prev , vice-versa for end insertion)

    return 0;
}