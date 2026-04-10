package MyString;

public class AddBinaryStrings {

    public static String addStrings(String a ,String b){
        int i=a.length()-1;
        int j=b.length()-1;

        int carry=0;

        StringBuilder sb=new StringBuilder();

        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }

            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }

            sb.append(sum%2);
            carry=sum/2;
        }

        if(carry!=0){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(addStrings(a, b)); //ans:10101
        
    }
}