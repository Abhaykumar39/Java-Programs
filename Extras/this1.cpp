#include <bits/stdc++.h>
using namespace std;
int MaxPathSum(int **arr, int m, int n)
{
    for (int i = 1; i < n; i++)
        arr[0][i] += arr[0][i -1];
    for (int i = 1; i < m; i++)
        arr[i][0] += arr[i - 1][0];

    for (int i = 1; i < m; i++)
        for (int j = 1; j < n; j++)
        {
            arr[i][j] += max(arr[i - 1][j], arr[i][j - 1]);
        }
    return arr[m - 1][n - 1];
}
int main()
{
    int n, m;
    cin >> m >> n;
    int **values;
    values = new int *[m];
    for (int i = 0; i < m; i++)
    {
        values[i] = new int[n];
    }
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            cin >> values[i][j];
    cout << MaxPathSum(values, m, n) << endl;
}