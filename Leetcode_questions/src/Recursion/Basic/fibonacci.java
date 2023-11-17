package Recursion.Basic;
//Tail recursion is defined as a recursive function in which the
// recursive call is the last statement that is executed by the function.
public class fibonacci {
    public static void main(String[] args) {
    System.out.println(fibo(6));
    }

    public static int fibo(int n){
        if(n <2 ){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
