package MyString;

import java.util.*;
public class LongestCommonPrefix {
    public static String longestPrefix(String str[]){
        StringBuilder ans=new StringBuilder();

        Arrays.sort(str);       //Sort the array

        String first=str[0];
        String last=str[str.length-1];
//Compare the 1st and last string.Because they will be the most different after sorting
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){            
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};

        System.out.println(longestPrefix(str));
    }
    
}
