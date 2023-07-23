#include <stdio.h>

#define SIZE 5




void display(int arr[]){
        for(int i = 0 ; i < SIZE ; i++){
        printf("%d"  , arr[i]);
    }
}
void reverse(int arr[]){
    int i , j;
    for(i = 0 ,  j = SIZE-1 ;i<j ; i++ , j--){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    display(arr);
}

int main(){
    int *iptr = NULL;
    int arr[SIZE] ;
    int i ,j ;
    printf("%d" , iptr);
    printf("enter the values : \n");
    for(int i = 0 ; i < SIZE ; i++){
        scanf("%d"  , &arr[i]);
    }

   
reverse(arr);

    return 0;
}

