#include <iostream>
using namespace std;

int f(int a[], int n1, int b[], int n2)
{
    int co = n1;
    cout << n1 << "," << n2 << endl;
    for (int i = 0; i < n2; i++)
    {
        for (int j = 0; j < n1; j++)
        {
            if (b[i] == a[j])
            {
                break;
            }
            if (j == n1 - 1)
            {
                co++;
            }
        }
    }

    return co;
}
int main()
{

    int a[] = {1, 2, 3, 4, 5};
    int n1 = sizeof(a) / sizeof(a[0]);
    int b[] = {1, 2, 3};
    int n2 = sizeof(b) / sizeof(b[0]);

    if (n1 > n2)
    {
        cout << f(a, n1, b, n2);
    }
    else
    {
        cout << f(b, n2, a, n1);
    }

    return 0;
}