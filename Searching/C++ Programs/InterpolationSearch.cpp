#include <iostream>
using namespace std;

int main()
{
    int arr[] = {1, 3, 5, 7, 9, 11, 13};
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
        int position = end + (start - end) * ((target - arr[end]) / (arr[start] - arr[end]));
        if (target == arr[position])
        {
            return position;
        }
        else if (target < arr[position])
        {
            end = position - 1;
        }
        else if (target > arr[position])
        {
            start = position + 1;
        }
    }
    // In case value not found
    return -1;
}