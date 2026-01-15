package MyString;

import java.util.*;
public class ReverseWordInString {
    public static String reverse(String s){
        Stack<String> st=new Stack<>();
        String arr[]=s.trim().split("\\s+");

        for(String word:arr){
            st.push(word);
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()){
                sb.append(" ");
            }
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String s="I Study at PCET";
        System.out.println(reverse(s));

        
    }
    
}
