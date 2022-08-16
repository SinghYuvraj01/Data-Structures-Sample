#include <iostream>
using namespace std;

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
    int target;
    cout << "Enter the target : ";
    cin >> target;

    // Call function to find target value by doing binary search
    void find(int arr[], int target);
    find(arr, target);
}

int find(int arr[], int target)
{
    void size = sizeof(arr) / sizeof(arr[0]);
    cout << size;
}
