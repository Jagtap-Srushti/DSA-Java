package MyString;
import java.util.*;;
//Roman numerals are represented by seven different symbols: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
// For example: 2 is written as II, 12 is written as XII, 27 is written as XXVII.
// Roman numerals are usually written largest to smallest from left to right. But in six special cases, subtraction is used instead of addition:
// I before V or X → 4 and 9,
// X before L or C → 40 and 90,
// C before D or M → 400 and 900
// Given a Roman numeral, convert it to an integer.

public class RomanToInteger {

    public static int romanToIntegre(String s){
        int n=s.length();
        int res=0;

        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i=0;i<n-1;i++){

            // Subtract if current value is less than next value
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){ //
                res-=map.get(s.charAt(i));
            }
             // Otherwise, add the value
            else{
                res+=map.get(s.charAt(i));
            }
        }
        // Add value of last character
        res+=map.get(s.charAt(n-1));

        return res;



    }
    public static void main(String[] args) {
        String s = "XV"; 
        System.out.println(romanToIntegre(s));
    }

    
}