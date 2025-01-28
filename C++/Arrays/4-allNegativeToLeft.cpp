#include <iostream>
using namespace std;

void rearrangeArray(int arr[], int n)
{
    int temp[n]; // Temporary array to hold the rearranged elements
    int index = 0;

    // First pass: Add all positive elements to temp
    for (int i = 0; i < n; i++)
    {
        if (arr[i] >= 0)
        {
            temp[index++] = arr[i];
        }
    }

    // Second pass: Add all negative elements to temp
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < 0)
        {
            temp[index++] = arr[i];
        }
    }

    // Copy back the elements to the original array
    for (int i = 0; i < n; i++)
    {
        arr[i] = temp[i];
    }
}

int main()
{
    int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    rearrangeArray(arr, n);

    // Print the rearranged array
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}
