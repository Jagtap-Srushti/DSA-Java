package Stack;
import java.util.*;

public class DuplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                int count=0;
                while(!s.empty() && s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; //Duplicate
                }
                else{
                    s.pop(); //remove opening pair
                }
                
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args){

        String str="({[]})";
        System.out.println(isDuplicate(str));
    }
    
}
