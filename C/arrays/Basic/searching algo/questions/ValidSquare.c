#include <stdio.h>
#include <stdbool.h>


bool isPerfectSquare(int num){

  int result = 0 ;
  while(result != num){
    int i = 1 ;
    result = i*i;
    
    if(result == num){
      return true;
    }else{
      i++;
    }
  }
  return false ;
}

int main(){
   bool ans =  isPerfectSquare(16);
   printf(" anser %d", ans);
}