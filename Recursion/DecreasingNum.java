package Recursion;

public class DecreasingNum {
    public static void decNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decNum(n-1);
    }
    public static void main(String[] args) {
        decNum(10);
        
    }
    
}
