import java.util.*;
class program{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        // System.out.println("Give input for the array ");
        //   for(int i =  0 ; i < arr.length ; i++){
        //     arr[i] = sc.nextInt();
        // }
        deleteAtIndex(arr , 1 );

    }
//func1
    static void deleteFirst(int arr[]){
      for(int i = 0 ; i< arr.length-1 ;i++){
        
          arr[i] = arr[i+1];
          
      }
      arr[arr.length-1]= 0;
   System.out.println(Arrays.toString(arr));
    }

    //func2

    

  static void deleteAt(int arr[]){
        int startIndex = getIndex(arr , 5);
        if(startIndex == -1){
            System.out.println("value not found !");
            return;
        }
        if(startIndex == arr.length-1){
            arr[arr.length-1] = 0;
            System.out.println(Arrays.toString(arr));
            return;
        }


      for(int i = startIndex ; i<arr.length-1 ;i++){
       
          arr[i] = arr[i+1];
          
      }
      arr[arr.length-1] = 0;
   System.out.println(Arrays.toString(arr));
    }
  

    //func3
     static void deleteAtIndex(int arr[] , int startIndex){
       
        if(startIndex == -1){
            System.out.println("index does not exists !");
            return;
        }
        if(startIndex == arr.length-1){
            arr[arr.length-1] = 0;
            System.out.println(Arrays.toString(arr));
            return;
        }


      for(int i = startIndex ; i<arr.length-1 ;i++){
       
          arr[i] = arr[i+1];
          
      }
      arr[arr.length-1] = 0;
   System.out.println(Arrays.toString(arr));
    }



    static int getIndex(int arr[] , int data){
        for(int i = 0 ; i< arr.length ;i++){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }   


}