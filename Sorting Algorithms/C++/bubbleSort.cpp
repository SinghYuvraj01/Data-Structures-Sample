#include <iostream>
using namespace std;

int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);

    // Outer loop for the pases
    for (int i = 0; i < size - 1; i++)
    {
        int flag = 0;
        // Inner loop for sorting
        for (int j = 1; j < size - i; j++)
        {
            if (arr[j] > arr[j - 1])
            {
                flag++;
                int swap = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = swap;
            }
        }
        if (flag == 0)
        {
            break; // Means array is sorted
        }
    }

    cout << "Array after sorting : ";
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}