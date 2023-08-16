
#include <stdio.h>
#include <stdlib.h>

// simple fibonacci
//    int sum = 0;

int fibo(int n)
{
    if (n < 2)
    {
        return n;
    }
    return fibo(n - 1) + fibo(n - 2);
}

// binary search using recursion

int countZero(int n , int count ){
    if(n%10 == n){
        return count;
    }
    int rem = n %10;
    if(rem == 0){
        count++;
    }
    return countZero(n/10 , count);
}
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

int fact(int n){
    if(n ==1 ){
        return n ;
    }

   return n*fact(n-1);
}

// int sum(int n ){
   
//     if(n == 0){
    
//         return 0;
//     }


//     return (n%10)+ sum(n/10);
// }

int product(int n ){
   
    if(n == 0){
    
        return 1;
    }


    return (n%10)* product(n/10);
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


void concept(int n){
    if(n == 0){
        return ;
    }
 printf("%d" , n);
 concept(--n);
    
}

// void reverse(int n ){
//     if(sum == 0 ){
//         return ;
//     }

//     int rem = n%10;
//     sum = (sum*10)+rem;
//     reverse(n/10 );

int main()
{
    int arr[] = {1, 2, 3, 4, 5};
    // int searchV =  search(arr , 0 , 4 , 3);
    // printf("%d" , searchV);
    // printn(5);
 
    printf("%d" , countZero(30001 ,0 ));
   
}