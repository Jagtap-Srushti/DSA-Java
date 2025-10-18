package Recursion;

public class PowerOfNum {
    
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }

        int halfPower=power(a,n/2);

        int halfPwhalfPowerSq=halfPower*halfPower;  //even

        if(n%2!=0){
            return a*halfPwhalfPowerSq;      //odd
        }
        return halfPwhalfPowerSq;


    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    
}
