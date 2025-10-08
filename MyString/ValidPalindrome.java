package MyString;

public class ValidPalindrome {

    public static boolean checkPalindrome(String s){
        s=s.toLowerCase();    //convert to lowercase
        s=s.replaceAll("[^a-z0-9]", "");  //remove non alpha-numeric character

        int start=0;
        int end=s.length()-1;

        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;

    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        if(checkPalindrome(str)){
            System.out.println(str+" is Palindrome");
        }
        else{
            System.out.println(str+" is not Palindrome");
        }
        
    }
    
}
