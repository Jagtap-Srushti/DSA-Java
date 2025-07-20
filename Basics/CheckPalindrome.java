package Basics;

public class CheckPalindrome {
    public static boolean isPalindrome(int num){
        int original=num;
        int reverse=0;

        while(num>0){
            int lastDigit=num%10;
            reverse=reverse*10+lastDigit;
            num/=10;
        }

        return original==reverse;
    }

    public static void main(String[] args){
        int num=123212;
        if(isPalindrome(num)){
            System.out.println(num+" is palindrome");
        }
        else{
            System.out.println(num+" is not palindrome");
        }
    }
    
}
