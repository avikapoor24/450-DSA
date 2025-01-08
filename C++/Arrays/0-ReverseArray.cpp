/*
Sample Input 1:
2
6 3
1 2 3 4 5 6
5 2
10 9 8 7 6
Sample Output 1:
1 2 3 4 6 5
10 9 8 6 7
*/
#include <iostream>
using namespace std;

void RevArr(int arr[10000], int n)
{
    for (int i = n - 1; i >= 0; i--)
    {
        cout << arr[i] << " ";
    }
}

int main()
{
    int arr[10000];
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // function call
    RevArr(arr, n);

    return 0;
}