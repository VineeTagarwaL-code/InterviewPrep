package Recursion.Basic;

public class Product {
    public static void main(String[] args) {
        System.out.println(prodOfDig(51));
    }
    static int prodOfDig(int n ){
        if( n == 0){
            return 1;
        }

        return n%10 * prodOfDig(n/10);

    }

}
