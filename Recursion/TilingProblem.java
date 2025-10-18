package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n){
        if(n==0 ||n==1){
            return 1;
        }

        return tilingProblem(n-1)+tilingProblem(n-2);
    }
    public static void main(String[] args) {
        //No of ways to tile given board(2xn) size using 2x1 tiles
        System.out.println(tilingProblem(5));
        
    }
    
}
