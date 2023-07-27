// this covers the basic of recursion in depth

#include <stdio.h>
#include <stdlib.h>
 
//simple recursive function 
void recursiveNo(int n)
{  
}

//simple fibonacci 
int fibo(int n ){
    if(n < 2){ 
        return n;
    }
    return fibo(n-1)+fibo(n-2);
}
int search(int arr[] , int searchValue , int low , int high)
{
    if(low > high){
        return -1;
    }
   int mid = low + (high-low)/2;
   if(arr[mid] == searchValue){
    return mid;
   }
   if(searchValue < arr[mid]){
   return  search(arr , searchValue , low , (mid-1));
   }else{
   return  search(arr , searchValue , (mid+1) , high);
   }

}
//binary search using recursion 


int main()
{
    // recursiveNo(1);
    int ans ;
    int arr[] ={1,2,3,4,5,6,8};
    int target = 0;
    int index = search(arr , target , 0 , 6);
    printf("%d" , index);
    // ans = fibo(4);
    // printf("%d" , ans);
    return 0;
}
