public class Recursion_3 {
    public static void main(String[] args) {
        triangle(1 , 0, 4);
        invertedTriangle(4, 0);
    }
  

    //normal triangle

    static void triangle(int r ,int c , int limit){
        if(r==0 || r==limit ){
            return;
        }

      if(c < r){
        System.out.print("*");
        triangle(r, c+1 , limit);
      }
      else{
        System.out.println();
        triangle(r+1, 0 , limit);
      }
    }

    //inverted triagnle

    static void invertedTriangle(int r , int c){
         if(r==0 ){
            return;
        }

      if(c < r){
        System.out.print("*");
        invertedTriangle(r, c+1 );
      }
      else{
        System.out.println();
        invertedTriangle(r-1, 0 );
      }
    }

    //bubble sort using recrusion 


    
}
 