package MyString;

import java.util.*;
public class LongestSubStringWithoutRepeatedCharacters {


    public static boolean isUnique(String s){
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }

        return true;
    }
    public static int lengthOfLongestSubstringBrute(String s){
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isUnique(s.substring(i,j+1))){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstring(String s){
        int n=s.length();
        int left=0;
        int max=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max=Math.max(max,right-left+1);
        }

        return max;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    
}
