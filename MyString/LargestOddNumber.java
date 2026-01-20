package MyString;
public class LargestOddNumber {

    public static String largestOddString(String str){
        for(int i=str.length()-1;i>=0;i--){
            int digit=str.charAt(i)-'0';

            if(digit%2!=0){         // Check if the digit is odd
                // If odd, return substring from start to this index
                return str.substring(0, i+1);       
            }
        }

        // If odd, return substring from start to this index
        return "";
    }
    public static void main(String[] args) {
        String str="3542";

        System.out.println(largestOddString(str));
    }
}
