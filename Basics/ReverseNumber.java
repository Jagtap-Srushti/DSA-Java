package Basics;

public class ReverseNumber {
    public static int reverse(int num){
        int res=0;
        while(num>0){
            int lastDigit=num%10;
            res=res*10+lastDigit;
            num/=10;

        }
        return res;

    }
    public static void main(String [] args){

        int num=12345;
        System.out.println(reverse(num));

    }
    
}
