package Basics;

public class ConvertBinaryToDecimal {
    public static int bintoDec(int binNum){
        int dec=0;
        int pow=0;

        while(binNum>0){
            int lastDigit=binNum%10;
            dec=dec+lastDigit*(int)Math.pow(2,pow);
            binNum/=10;
            pow++;
        }
        return dec;
    }
    public static void main(String[] args){

        System.out.println(bintoDec(111));

    }
}