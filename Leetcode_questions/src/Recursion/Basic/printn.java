package Recursion.Basic;

public class printn {
    public static void main(String[] args) {
    printn(5);
    }

    static void printn(int n){
        if(n == 0){
            return ;
        }

        System.out.println(n);
        printn(--n);

    }
}
