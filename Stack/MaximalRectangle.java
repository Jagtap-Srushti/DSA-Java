package Stack;

import java.util.*;

public class MaximalRectangle {
    public int maxArea(int heights[]) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int nse[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.empty()) {
                nse[i] = n;
            } else {
                nse[i] = st.peek();
            }
            st.push(i);
        }

        st = new Stack<Integer>();
        int pse[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.empty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.empty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, heights[i] * (nse[i] - pse[i] - 1));
        }
        return maxArea;

    }

    public int maximalRectangle(char matrix[][]){
        if(matrix.length==0){
            return 0;
        }
        int rows=matrix.length;
        int cols=matrix[0].length;

        int heights[]=new int[cols];
        int maxArea=Integer.MIN_VALUE;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                }
                else{
                    heights[j]=0;
                }
            }
            maxArea=Math.max(maxArea,maxArea(heights));
        }

        return maxArea;

        
    }

    public static void main(String[] args) {
        char matrix[][] = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };

        MaximalRectangle obj = new MaximalRectangle();

        System.out.println(obj.maximalRectangle(matrix));
    }
}
