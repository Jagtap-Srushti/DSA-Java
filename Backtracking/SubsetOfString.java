package Backtracking;


//Find all Subset of given String
import java.util.*;
public class SubsetOfString {

    public List<String> subsetofString(String str){
        List<String> ans=new ArrayList<>();
        backtracking(ans,str,"",0);
        return ans;
    }

    public void backtracking(List<String> ans,String str,String curr,int i){

        if(i==str.length()){
            ans.add(curr);
            return;
        }
        backtracking(ans, str,curr+str.charAt(i),i+1);
        backtracking(ans, str, curr, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        SubsetOfString obj=new SubsetOfString();
        List<String> result=obj.subsetofString(str);

        for(String s:result ){
            System.out.println(s);
        }

        //ans:-
        // abc
        // ab
        // ac
        // a
        // bc
        // b
        // c
        //" "
        
    }
    
}
