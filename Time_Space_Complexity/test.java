import java.util.*;
public class test {


    public static void main(String args[]){
    
     System.out.println(fiboF(50));
    }

    static long fiboF(int n){
        return (long) ( (Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n)) / Math.sqrt(5)); 
    }
}
