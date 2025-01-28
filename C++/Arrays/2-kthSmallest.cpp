/*
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output:  7
Explanation: 3rd smallest element in the given array is 7.
Input: arr[] = [2, 3, 1, 20, 15], k = 4
Output: 15
Explanation: 4th smallest element in the given array is 15.
*/
// Code works on online compiler
#include <iostream>
#include <climits>
using namespace std;

int KthSmallest(int arr[], int n, int k)
{
    // Find MaxEle
    int maxEle = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        if (maxEle < arr[i])
        {
            maxEle = arr[i];
        }
    }

    // Freq Arr
    int freq[maxEle + 1] = {0};
    for (int i = 0; i < n; i++)
    {
        freq[arr[i]]++;
    }

    // KSM
    int count = 0;
    for (int i = 0; i < maxEle; i++)
    {
        count += freq[i];
        if (k <= count)
        {
            return i;
        }
    }
    return -1;
}

int main()
{
    int n = 6;
    // cin >> n;
    int k = 3;
    // cin >> k;
    int arr[10000];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // Function call
    int a = KthSmallest(arr, n, k);
    cout << a;

    return 0;
}