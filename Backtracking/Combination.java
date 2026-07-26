package Backtracking;
import java.util.*;

public class Combination {

    public List<List<Integer>> combination(int n,int k){
        List<List<Integer>> ans=new ArrayList<>();
        backtracking(ans,k,n,new ArrayList<>(),1);
        return ans;

    }

    public void backtracking(List<List<Integer>> ans,int k,int n,List<Integer> curr,int idx){

        if(curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx;i<=n;i++){
            curr.add(i);
            backtracking(ans,k,n,curr,i+1);
            curr.remove(curr.size()-1);
        }
        
    }
    public static void main(String[] args) {
        int n=4;
        int k=2;
        Combination obj=new Combination();
        List<List<Integer>> result=obj.combination(n, k);
        System.out.println(result);

        //ans: [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
    }
}
