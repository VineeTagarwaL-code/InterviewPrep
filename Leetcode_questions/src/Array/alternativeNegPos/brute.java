package Array.alternativeNegPos;

import java.util.ArrayList;
import java.util.Arrays;

public class brute {
   public static int[] RearrangebySign(int[] A, int n){
    
  // Define 2 vectors, one for storing positive 
  // and other for negative elements of the array.
  ArrayList<Integer> pos=new ArrayList<>();
  ArrayList<Integer> neg=new ArrayList<>();
  
  // Segregate the array into positives and negatives.
  for(int i=0;i<n;i++){
      
      if(A[i]>0) pos.add(A[i]);
      else neg.add(A[i]);
  }
  
  // Positives on even indices, negatives on odd.
  for(int i=0;i<n/2;i++){
      
      A[2*i] = pos.get(i);
      A[2*i+1] = neg.get(i);
  }

 
  return A;
}    

public static void main(String args[]) 
{
  // Array Initialisation.
  int n = 4;
  int A[]= {1,2,-4,-5};


  int[]ans= RearrangebySign(A,n);
   
  for (int i = 0; i < n; i++) {
    System.out.print(ans[i]+" ");
  }

}
}
