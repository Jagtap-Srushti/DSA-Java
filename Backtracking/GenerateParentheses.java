package Backtracking;
//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
import java.util.*;
public class GenerateParentheses {

    public List<String> generateParentheses(int n){
        List<String> ans=new ArrayList<>();
        backtracking(ans, "", 0, 0, n);
        return ans;
        

    }

    public void backtracking(List<String> ans,String curr,int open,int closed,int n){

        if(curr.length()==n*2){
            ans.add(curr);
            return;
        }
        if(open<n){
            backtracking(ans, curr+"(", open+1, closed, n);
        }
        if(closed<open){
            backtracking(ans, curr+")", open, closed+1, n);
        }
    }


    public static void main(String[] args) {
        int n=3;

        GenerateParentheses obj=new GenerateParentheses();
        List<String> result=obj.generateParentheses(n);

        for(String str:result){
            System.out.println(str);
        }
        //Ans:-
        // ((()))
        // (()())
        // (())()
        // ()(())
        // ()()()

    }
    
}
