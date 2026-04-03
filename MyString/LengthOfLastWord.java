package MyString;

// Given a string s consisting of words and spaces, return the length of the last word in the string.

public class LengthOfLastWord {
    public static int countofLastWord(String s){
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch==' '){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s=" Hello World ";
        System.out.println(countofLastWord(s));
    }
}