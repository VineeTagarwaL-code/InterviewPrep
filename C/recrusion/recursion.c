// this covers the basic of recursion in depth

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

int search(int arr[], int searchValue, int low, int high)
{
    if (low > high)
    {
        return -1;
    }
    int mid = low + (high - low) / 2;
    if (arr[mid] == searchValue)
    {
        return mid;
    }
    if (searchValue < arr[mid])
    {
        return search(arr, searchValue, low, (mid - 1));
    }
    else
    {
        return search(arr, searchValue, (mid + 1), high);
    }
}

// find if array is sorted using recursion
int isSorted(int arr[], int size, int index)
{

    if (index == size - 1)
    {
        return 1;
    }
    return arr[index] < arr[index + 1] && isSorted(arr, size, index + 1);
}

// linear search using recursion

int linearSearch(int arr[], int size, int search, int index)
{
    if (index == -1)
    {
        return -1;
    }

    if (arr[index] == search)
    {
        return 1;
    }
    return linearSearch(arr, size, search, index + 1);
}

int linearSearchMO(int arr[], int size, int search, int index)
{
    if (index == -1)
    {
        return -1;
    }

    if (arr[index] == search)
    {
        return 1;
    }
    return linearSearch(arr, size, search, index + 1);
}
// linear search on multiple occurence

int main()
{
    int choice, data;
    int arr[] = {1,
                 2,
                 3,
                 4,
                 5,
                 6,
                 7,
                 8,
                 9,
                 10};
    int size = 9;
    while (1)
    {
        printf("press 1 for fibonacci series \n");
        printf("press 2 for binary search \n");
        printf("press 3 for linear search \n");
        printf("press 4 for linear search on multiple occurences \n");
        printf("press 5 for checking if the array is sorted \n");
        printf("press 6 for exiting\n");
        printf("enter your choice \n");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("enter the nth value \n");
            scanf("%d", &data);
            fibo(data);
            printf("\n");
            printf("\n");
            break;
        case 2:
            printf("enter the value for searching \n");
            scanf("%d", &data);
            printf("%d", search(arr, data, 0, size));
            printf("\n");
            printf("\n");
            break;
        case 3:
            printf("enter the value for searching \n");
            scanf("%d", &data);
            printf("%d", linearSearch(arr, size, data, 0));
            printf("\n");
            printf("\n");

            break;
        case 4:
            printf("enter the value for searching \n");
            scanf("%d", &data);
            printf("%d", linearSearchMO(arr, size, data, 0));
            printf("\n");
            printf("\n");

            break;
        case 5:
            printf("%d", isSorted(arr, size, 0));
            printf("\n");
            printf("\n");

            break;
        case 6:
            exit(1);
            break;
        default:
            break;
        }
    }
    return 0;
}
