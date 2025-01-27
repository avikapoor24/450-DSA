/*
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
*/

#include <iostream>
using namespace std;
void sorting012(int arr[10000], int n)
{
    int z = 0, o = 1, t = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == 0)
        {
            z++;
        }
        if (arr[i] == 1)
        {
            o++;
        }
        if (arr[i] == 2)
        {
            t++;
        }
    }

    // O/P
    for (int i = 1; i <= n; i++)
    {
        if (i <= z)
        {
            cout << 0 << " ";
            continue;
        }
        if (i < z + o)
        {
            cout << 1 << " ";
            continue;
        }
        if (i <= n)
        {
            cout << 2 << " ";
            continue;
        }
    }
}

int main()
{
    // int arr[1000];
    int arr[] = {0, 1, 2, 0, 1, 2, 0, 1, 2};
    int n = sizeof(arr) / sizeof(int);
    // Function Call
    sorting012(arr, n);

    return 0;
}