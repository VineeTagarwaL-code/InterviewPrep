package Recursion.Basic;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(51));
    }
    public static int reverse(int n ){
        if( n == 0){
            return n ;
        }
        return ((n%10)*10) +  reverse(n/10);
    }
}
