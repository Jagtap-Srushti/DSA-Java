package Stack;
import java.util.*;
public class trappingRainWater {
    public static int rainWater(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];

        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.empty() && height[s.peek()<=height[i]]){
                s.pop();
            }
            if(s.empty()){
                leftMax[i]
            }
        }
        int trapWater=0;
        return trapWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};

    }
    
}
