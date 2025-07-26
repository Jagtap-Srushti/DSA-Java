package Stack;

import java.util.*;
public class Histogram {
    public static int maxArea(int height[]){
        int n=height.length;

        int nsr[]=new int[n];
        int nsl[]=new int[n];
        int maxArea=0;
        Stack<Integer> s=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!s.empty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.empty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.empty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.empty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<n;i++){
            int ht=height[i];
            int width=nsr[i]-nsl[i]-1;
            int area=ht*width;
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;

    }
    public static void main(String[] args) {
        int height[]={2,1,5,6,2,3};
        System.out.println("Maximum Area of Histogram is:"+maxArea(height));
        
    }
    
}
