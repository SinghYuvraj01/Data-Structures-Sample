#include <iostream>
using namespace std;

int main()
{
    int arr[] = {1, 2, 45, 3, 5, 6};
    int size = sizeof(arr) / sizeof(arr[0]);
    int target;
    cout << "Enter target value : ";
    cin >> target;

    // Call function to find the value
    int find(int arr[], int size, int target);
    int ans = find(arr, size, target);
    if (ans == -1)
    {
        cout << "Value not found !!";
    }
    else
    {
        cout << "Value present at : " << ans;
    }
    return 0;
}

// Function to find the value
int find(int arr[], int size, int target)
{
    for (int i = 0; i < size; i++)
    {
        if (target == arr[i])
        {
            return i;
        }
    }

    // In case value not found
    return -1;
}