package MyString;


// Given a pattern and a string s, find if s follows the same pattern.Example 1:
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true

import java.util.HashMap;

public class WordPattern{

    public static boolean chackPattern(String pattern, String s){
        String arr[]=s.split(" ");

        if(arr.length!=pattern.length()){
            return false;
        }

        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=arr[i];

            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                map1.put(ch,word);
            }

            if(map2.containsKey(word)){
                if(map2.get(word)!=ch){
                    return false;
                }
            }
            else{
                map2.put(word,ch);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(chackPattern(pattern, s));
        
    }
}