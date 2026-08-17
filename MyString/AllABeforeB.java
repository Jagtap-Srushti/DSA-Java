package MyString;

// Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

public class AllABeforeB {

    public static boolean checkString(String s) {
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)<s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="aababbb";//false
        //String s="aaabbb"; //true

        System.out.println(checkString(s));
    }
}
