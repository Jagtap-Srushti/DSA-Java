package Basics;


public class LeapYear {
    public static boolean isLeap(int year){
    if((year%4==0 && year%100!=0) || (year%400==0)){
        return true;
    }
    return false;
}

    public static void main(String []args){
        int year=2009;
        if(isLeap(year)){
            System.out.println(year+ " is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

    }
    
}
