package MyString;

// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

public class AddStrings {

    public static String addStrings(String num1 ,String num2){
        int i=num1.length()-1;
        int j=num2.length()-1;

        int carry=0;
        StringBuilder sb=new StringBuilder();

        while(i>=0 || j>=0 || carry>0){
            int n1=(i>=0)?num1.charAt(i)-'0':0;
            int n2=(j>=0)?num2.charAt(j)-'0':0;

            int sum=n1+n2+carry;
            sb.append(sum%10);
            carry=sum/10;

            i--;
            j--;

        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "129";

        System.out.println(addStrings(num1, num2));
    }
}