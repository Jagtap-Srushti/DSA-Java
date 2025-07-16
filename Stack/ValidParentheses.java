package Stack;
import java.util.*;
public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }
                else{
                    if((st.peek()=='(' && ch==')')
                    ||(st.peek()=='[' && ch==']')
                    ||(st.peek()=='{' && ch=='}')){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args){
        String str="({[]})";
        if(isValid(str)){
            System.out.println(str+ " is valid parentheses");
        }
        else{
            System.out.println(str+ " is not a valid parentheses");
        }

    }
    
}
