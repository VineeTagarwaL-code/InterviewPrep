
#include <stdio.h>
#include <stdlib.h>

// simple fibonacci

int fibo(int n)
{
    if (n < 2)
    {
        return n;
    }
    return fibo(n - 1) + fibo(n - 2);
}

// binary search using recursion

int search(int arr[], int low, int high, int searchValue)
{
    if (low > high)
    {
        return -1;
    }
    int mid = low + (high - low) / 2;
    if (arr[mid] == searchValue)
    {
        return searchValue;
    }
    if (arr[mid] < searchValue)
    {
        low = mid - 1;
    }
    else
    {
        high = mid + 1;
    }

    return search(arr, searchValue, low, high);
}

void printn(int n)
{
    if (n < 1)
    {
        return;
    }

    printf("%d ", n);
    printn(n - 1);
    printf("%d ", n);
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    // int searchV =  search(arr , 0 , 4 , 3);
    // printf("%d" , searchV);
    printn(5);
}