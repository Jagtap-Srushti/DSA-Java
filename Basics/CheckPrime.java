package Basics;

public class CheckPrime {
    public static boolean checkPrime(int num){

        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        int num=5;
        if(checkPrime(num)){
            System.out.println(num+ " is prime number");
        }
        else{
            System.out.println(num+ " is not prime number");
        }


    }
    
}
