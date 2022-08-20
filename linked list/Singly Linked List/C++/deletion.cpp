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

void deleteAtHead(Node *&head)
{
    if (head == NULL)
    {
        cout << "Nothing to delete";
        return;
    }
    Node *remove = head;
    head = remove->next;
    delete (remove);
}

void deleteAtEnd(Node *&head)
{
    if (head == NULL)
    {
        cout << "Nothing to delete";
        return;
    }
    Node *temp = head;
    // Have to stop at second last node
    while (temp->next->next != NULL)
    {
        temp = temp->next;
    }
    Node *remove = temp->next;
    temp->next = NULL;
    delete (remove);
}

void deleteAtMiddle(Node *&head)
{
    if (head == NULL)
    {
        cout << "Nothing to delete";
        return;
    }
    Node *slow = head;
    Node *fast = head;
    while (fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
    }
    Node *remove = slow->next;
    slow->value = remove->value;
    slow->next = remove->next;
    delete (remove);
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

    // Function to insert value at head
    void deleteAtHead(Node * &head);
    // deleteAtHead(a);

    // Function to insert value at end
    void deleteAtEnd(Node * &head);
    // deleteAtEnd(a);

    // Function to insert value at middle
    void deleteAtMiddle(Node * &head);
    deleteAtMiddle(a);

    // Function to print singly linked list
    void print(Node * head);
    print(a);

    return 0;
}