#include <iostream>
using namespace std;

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6};
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
    // Define the search space
    int start = 0;
    int end = size - 1;

    while (start <= end)
    {
        int middle = start + (end - start) / 2;
        if (target == arr[middle])
        {
            return middle;
        }
        else if (target < arr[middle])
        {
            end = middle - 1;
        }
        else if (target > arr[middle])
        {
            start = middle + 1;
        }
    }
    // In case value not found
    return -1;
}