package Recursion.Basic;

public class Sum {
    public static void main(String[] args) {
   System.out.println(sumofdig(214));
    }

   static int sumofdig(int n ){
        if( n == 0){
            return 0;
        }

        return n%10 + sumofdig(n/10);

   }
}
