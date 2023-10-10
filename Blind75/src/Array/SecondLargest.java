package Array;

public class SecondLargest {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
      //most optimal solution
      System.out.println(secondLargestOPT(arr));
        System.out.println(secondSmallestOPT(arr));
      //better solution
      System.out.println(Secondlargest(arr , arr[arr.length-1]));
    }

    static int largest(int[] arr){
        int largest = arr[0];
        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] > largest ){
                largest = arr[i];
            }
        }
        return largest;
    }

   static int Secondlargest(int[] arr , int largest){
        int Secondlargest = arr[0];
        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] > Secondlargest  && arr[i] < largest ){
                Secondlargest = arr[i];
            }
        }
        return Secondlargest;
    }

    static int secondLargestOPT (int[] arr){
        int largest = arr[0];
        int Secondlargest = -1;
        for(int i= 0 ; i < arr.length ;i++){
         if(arr[i] > largest){
             Secondlargest = largest;
             largest = arr[i];
         }else if(Secondlargest < arr[i]){
             Secondlargest = arr[i];
         }
        }
        return Secondlargest;
    }

    static int secondSmallestOPT (int[] arr){
        int smallest = arr[0];
        int SecondSmallest = Integer.MAX_VALUE;
        for(int i= 0 ; i < arr.length ;i++){
            if(arr[i] < smallest){
                SecondSmallest = smallest;
                smallest = arr[i];
            }else if(SecondSmallest > arr[i] && arr[i] != smallest){
                SecondSmallest = arr[i];
            }
        }
        return SecondSmallest;
    }

}
