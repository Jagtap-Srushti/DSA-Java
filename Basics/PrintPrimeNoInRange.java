package Basics;

public class PrintPrimeNoInRange {
    public static void printPrime(int range){
        for(int i=2;i<=range;i++){
            Boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }

        }
    }
    public static void main(String[] args){
        printPrime(10);

    }
    
}
