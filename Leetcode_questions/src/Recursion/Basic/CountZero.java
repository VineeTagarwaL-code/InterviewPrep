package Recursion.Basic;

public class CountZero {
    public static void main(String[] args) {

        System.out.println(   countZero(01, 0));
    }

    public static int countZero(int n , int count){
        if(n== 0){
            return count;
        }
        int remp = n %10;
        if(remp == 0 ){
            return countZero(n/10 , count+1);
        }
            return countZero(n/10 , count);

    }
}
