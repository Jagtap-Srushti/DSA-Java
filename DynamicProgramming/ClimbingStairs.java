package DynamicProgramming;


// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 
import java.util.*;
public class ClimbingStairs {
    public static int climbStairs(int n,int ways[]){
        if(n==0){
            return 1;
        }

        if(n==-1){
            return 0;
        }

        if(ways[n]!=-1){
            return ways[n];
        }

        ways[n]=climbStairs(n-1, ways)+climbStairs(n-2, ways);
        return ways[n];
    }
    public static void main(String[] args) {
        int n=5;
        int ways[]=new int [n+1];
        Arrays.fill(ways,-1);

        System.out.println(climbStairs(n, ways));
        
    }
    
}
