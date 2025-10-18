package Recursion;

public class IncreasingNum {
    public static void incNum(int n){
        if(n==0){
            return;
        }

        incNum(n-1);
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        incNum(10);
        
    }
    
}
